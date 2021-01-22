package Projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileProject {
	
	public static void main(String[] args) {

		method1();
		method2();
	}

	public static void method1() {

		yazdir();
		try (BufferedReader reader = new BufferedReader(new FileReader("istiklal.txt"))) {

			String input;
			String[] arr;
			HashMap<String, Integer> occurence = new HashMap<>();

			while ((input = reader.readLine()) != null) {
				arr = input.toLowerCase().replaceAll("[.,]", "").split(" ");

				for (String x : arr)
					occurence.put(x, (occurence.get(x) == null) ? 1 : occurence.get(x) + 1);
			}

			for (Map.Entry entry : occurence.entrySet())
				System.out.println(entry.getKey() + " " + entry.getValue());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2() {
		yazdir();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("istiklal.txt"))) {

			String input;
			String[] arr;
			ArrayList<String> list = new ArrayList<>(); ;
			
			while ((input = reader.readLine()) != null) {
				arr = input.toLowerCase().replaceAll("[.,]", "").split(" ");
				Collections.addAll(list, arr);
			}
	
			Set<String> st = new HashSet<String>(list); 
	        for (String s : st) 
	            System.out.println(s + " : " + Collections.frequency(list, s)); 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void yazdir() {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("istiklal.txt"))) {

			writer.write("Korkma, sonmez bu safaklarda yuzen al sancak");
			writer.newLine();
			writer.write("Sonmeden yurdumun ustunde tuten en son ocak");
			writer.newLine();
			writer.write("O benim milletimin yildizidir, parlayacak");
			writer.newLine();
			writer.write("O benimdir, o benim mitlletimindir ancak");
			writer.newLine();
			writer.write("Catma, kurban olayim cehreni ey nazli hilal");
			writer.newLine();
			writer.write("Kahraman irkima bir gul.. ne bu siddet bu celal");
			writer.newLine();
			writer.write("Sana olmaz dokulen kanlarimiz sonra helal");
			writer.newLine();
			writer.write("Hakkidir, Hakka tapan, milletimin istiklal");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
