package arrays03;

import java.util.Arrays;

public class ArrayPractice2 {

	public static void main(String[] args) {
		
		// ### SWAP ###
		
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		
		System.out.println("Count: " + wordsArray.length);
		
		System.out.println(wordsArray[0]);
		
		System.out.println(Arrays.toString(wordsArray));
		
		for(String word : wordsArray) {
			System.out.println(word);
		}
		
		System.out.println();
//**********************************************************************************************************
		
		String diceResult = "1 - 20 of 1,461 position";
		
		// using split method, print 1,461
		
		String[] diceArray = diceResult.split(" ");
		
		System.out.println("Search result total: " + diceArray[4]);
		
		System.out.println("********************************************************************************");
//**********************************************************************************************************		
		
		String sentence = "I felt happy because I saw the others were happy and because "
							+ "I knew I should feel happy, but I wasn't really.";
		
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split(" happy");
		String[] ISplit = sentence.split("I");
		
		for(String w : allWords) {
			System.out.println(w);
		}
		
		System.out.println();
//*******************************************************		
		System.out.println("### AFTER HAPPY - SPLIT ###");
		
		for(String w : happySplit) {
			System.out.println(w);
		}
		
		System.out.println();
//********************************************************		
		System.out.println("### AFTER I - SPLIT ###");
		
		for(String w : ISplit) {
			System.out.println(w);
		}
		
		
		
	}

}
