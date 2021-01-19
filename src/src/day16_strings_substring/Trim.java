package day16_strings_substring;

public class Trim {

	public static void main(String[] args) {
		
		String word1 = " String methods ";
		System.out.println(word1.trim());
		System.out.println(word1);
		
		
		String word2 = "   ThreeSpaces here   ";
		System.out.println(word2.trim());
		
		System.out.println(word2);
		
		
		word2 = word2.trim();
		System.out.println(word2);
		
		
	}
}
