package day16_strings_substring;

public class Substring {

	public static void main(String[] args) {
		
		//### SUBSTRING ==> Returns part of the string  ### 
		
		//## 	LAST CHARACTER DOESNT INCLUDED 			###
		
		String sentence = "Java String manipulation is fun!";
		
		System.out.println(sentence.substring(0,4));  // print => JAVA
		System.out.println(sentence.substring(5,11)); // print => String
		System.out.println(sentence.substring(7,11)); // print => ring
		

	}

}
