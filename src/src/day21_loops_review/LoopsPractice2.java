package day21_loops_review;

public class LoopsPractice2 {

	public static void main(String[] args) {
		
		// ********** UNIQUE *************
		// ### GENERAL INTERVIEW QUESTION ###
		
		// Given a String word, print out unique characters from the word. (UNIQUE understood 2 different way)

		// Example: word = "wooden spoon" ("woden sp") (uniqueness cift yazilmis harfler olmadan)
		
		// Example: word = "java" (jav) 	(UNIQUENESS) FROM JAVA, so (jav) is unique now.
		// Example: "aabbccddef" (abcdef)   (UNIQUENESS) FROM JAVA
		
		
		String word   = "javva";
		String unique = "";
		
		char ch = word.charAt(0);  // ilk karakteri almak icin sifir'dan basliyor.
		System.out.println(unique.contains("" + ch)); // contains method (ch) olarak atadigimiz karakter unique olarak atadigimizin icersinde mi?
		
		if(!unique.contains(""+ch)) {
			unique += ch;			// unique = unique+ch
		}
		
		System.out.println("Unique Word: " + unique);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
