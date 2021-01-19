package day21_loops_review;

import java.util.*;

public class LoopsPractice6 {

	public static void main(String[] args) {
				
				// ******* SECOND WAY ************8
				// ********** UNIQUE *************
				// ### GENERAL INTERVIEW QUESTION ###
				
				// Given a String word, print out unique characters from the word. (UNIQUE understood 2 different way)

				// Example: word = "wooden spoon" ("woden sp") (uniqueness cift yazilmis harfler olmadan)
				
				// Example: word = "java" (jav) 	(UNIQUENESS) FROM JAVA, so (jav) is unique now.
				// Example: "aabbccddef" (abcdef)   (UNIQUENESS) FROM JAVA
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();				// javva
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			// read the letter and assign
			char letter = word.charAt(i);
			// System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique += letter; // add to unique
			}
		}
		
		System.out.println(unique);
		
		
		
//		for(int i = 0; i < word.length(); i++) {
//			System.out.print(i); // just print i - it increases every loop
//			System.out.println(word.charAt(i));
//		}
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
