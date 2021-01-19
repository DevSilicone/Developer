package day35_methods07_practice;

public class Practice3 {

	public static void main(String[] args) {
		
		// #### ENCRYPTION ####
		
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "html";
		String encrypted = encryptWord(normal);
		System.out.println("normal: " + normal + "\n" + "enctyped: " + encrypted);
		
		
		
	}
		
		/**
	  	encryptChar
	  	return type: char
	  	param : char
	  	takes a char and returns encrupted version
	  	encryptChar('a') ==> 'z'
		 * */ 

	public static char encryptChar(char ch) {
	
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	
	}
	
		/**
	 encryptWord
	 return type: String
	 param: String
	 take a string and returns encrypted version for the whole word
	 * */
	
	public static String encryptWord(String word) {
		String cyphered = "";
		for(int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
	}
	 return cyphered;
	
	
	}
	
	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += encryptWord(word) + " ";
		}
		return retValue.trim();
	}


}

	
	
	
	
	
	
	
	



