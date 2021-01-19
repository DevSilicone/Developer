package day31_methods03;

import java.util.Arrays;

public class MethodsPractice6 {

	public static void main(String[] args) {
		
		// ### Methods with String

		countWords("Java is fun");
		
		countWords("This is method with string");
		
		
		System.out.println("*************************************************************");
		
		
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
		String resultsStr = ("About 16,600,000 results (0.73 seconds)");
		googleSearchResults(resultsStr);
		
		
	}

	/**
	 name: countWords
	 return: void
	 params/args: String sentence
	 
	 countWords("Java is fun");
	 "Words in this sentence [java, is, fun]"
	 
	 "Number of words: "3"
	 * */
	
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence " + Arrays.toString(words));
		System.out.println("Number of words: " + words.length);
	}
	/***
	 Method name: googleSearchResults
	 Return type: void
	 params: 1 String
	 
	 googleSearchResults("About 121,000,000 results (0.75 seconds)");
	 "results count: 121000000"
	 "Time in seconds : 0.75"
	 * */
	
	public static void googleSearchResults(String result) {
		
		//split by spcae into array
		String[] words = result.split(" ");
		String count   = words[1].replace(",", "");  // => words[1] yazdik ki arattiimiz rakam 120 kusur binin sirasi o bosluklari kaldirinca
		String seconds = words[3].replace("(", "");	 // => words[3] yazdik ki, arattigimiz saniyenin sirasi oldugu icin
		
		System.out.println("Results count: " + count);
		System.out.println("Time in seconds: " + seconds);
		
	}
	
	
	
	
	
}
