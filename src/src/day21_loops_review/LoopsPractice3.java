package day21_loops_review;

public class LoopsPractice3 {

	public static void main(String[] args) {
		
		
		// ******* SECOND WAY ************8
		// ********** UNIQUE *************
		// ### GENERAL INTERVIEW QUESTION ###
		
		// Given a String word, print out unique characters from the word. (UNIQUE understood 2 different way)

		// Example: word = "wooden spoon" ("woden sp") (uniqueness cift yazilmis harfler olmadan)
		
		// Example: word = "java" (jav) 	(UNIQUENESS) FROM JAVA, so (jav) is unique now.
		// Example: "aabbccddef" (abcdef)   (UNIQUENESS) FROM JAVA
		
		
		String word   = "java";
		String unique = "";
		
		char ch = word.charAt(0);  // ilk karakteri almak icin sifir'dan basliyor.
		
		System.out.println(unique.contains(""+ch)); // contains method (ch) olarak atadigimiz karakter unique olarak atadigimizin icersinde mi?
													// ==> contains checks if one string in the other string (yani tirnak ici belirttigimizin icerisinde mi degil mi?
		
		System.out.println(unique.indexOf(ch));		// ==> gets a character from an index position
		
		
		if(!unique.contains(""+ch)) {				// if(unique.indexOf(ch) == -1) {
			unique += ch;							// unique = unique+ch
		}
		
		System.out.println("Unique Word: " + unique);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
