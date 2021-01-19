package day16_strings_substring;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		
		// ### looks for a certain string and replaces with another string.
		
		
		String word = "java";
		
		System.out.println(word.replace("a","e"));
		
		System.out.println(word.replace("j","c"));
		
		
		//=========================
		System.out.println();
		//=========================
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type word(s):");
		String words = input.nextLine();
		
		System.out.println(words.replace("a", "y"));
		System.out.println(words.replace("sad", "happy"));
		System.out.println(words.replace(" ", " | " )); // space to pipe
		
		
		
		
		
		
		
		
		
		
	}

}
