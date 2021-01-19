package day35_methods07_practice;

public class Practice2 {

	public static void main(String[] args) {
		
		// #### ENCRYPTION ####
		
	
		 String alphabet = "abcdefghijklmnipqrstuvwxyz";
		 String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		

		 String word = "easter";
		/* 
		 "e" --> "v"
		 "a" --> "z"
		 "s" --> "h"
		 "t" --> "g"
		 "e" --> "v"
		 "r" --> "i"
		*/
		 
		 
		 //
		 //
		 // read the char from encrypted at that index
		 // add to some string
		 
		 
		 // get a char from word
		 char first = word.charAt(0); // 'e'
		 int position = alphabet.indexOf(first);
		 System.out.println("position" + position);
		 
		 
		 // find indexOf the char in alphabet
		 char enChar = encrypted.charAt(position);
		 System.out.println(first + " --> " + enChar);
		 
		 // with a loop
		 String encryptedWord = "";
		 for(int i = 0; i < word.length(); i++) {
			 char ch = word.charAt(i);
			 //find in alphabet
			int index = alphabet.indexOf(ch);
			//System.out.print(encrypted.charAt(index));
			encryptedWord += encrypted.charAt(index);
			
		 }
		 
		 System.out.println((word));
		 System.out.println(encryptedWord);
		
	}

	
}
