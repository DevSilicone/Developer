package day37_arraylist;

import java.util.ArrayList;

//import java.util.ArrayList;

public class X02_ArrayListExample {

	public static void main(String[] args) {
		
		// declare arraylist called languages
		ArrayList<String> languages = new ArrayList<>();
		
		//add values
		languages.add("java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijan");
		languages.add("Ukranian");
		//languages.add(true);
		System.out.println("Number of values: " + languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: " + languages.size());
		
		//remove java
		languages.remove(0);
		System.out.println("Number of values: " + languages.size());
		
		System.out.println(languages.toString());
		
		
	
		
		
	}

	
	
	
	
	
}
