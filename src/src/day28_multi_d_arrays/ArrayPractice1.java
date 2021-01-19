package day28_multi_d_arrays;

import java.util.Arrays;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		// ### Reverse Sentence ###
		
		String sentence = "you are very interesting person ";
		
		
		// split by space
		String[] arrSentence = sentence.split(" ");						// cumle arasi bosluklari kaldirdik
		System.out.println("Number of words: " + arrSentence.length);	// kelimelerin java karsiligi numarasi cikiyor ama sart yapmak
		
		System.out.println(Arrays.toString(arrSentence));				// burada bosluklarini kaldirdigimiz kelimleri sirasi ile yazdiriyoruz.
		
		
		
		String reversed = "";
														  // i (en sondaki kelime olmus oldu artik ve onu atadik
		for(int i = arrSentence.length-1; i >= 0; i-- ) { // length give as 5 ( but the larger index is 4) thats why we start -1)
												   		  // we are coming to the first index from the last ( because we put 0)
														  // i -- ( because we are going to last one to first one) sondan geri gidiyoruz
			//System.out.print (arrSentence[i]);
			reversed += arrSentence[i] + " ";
		}
		
			//reversed = reversed.trim();				 // => ensonda olan boslugu kaldiriyor var ise
			System.out.println(reversed); 				 // => parantez disina print ediyoruz, iceri edersek sire ile harfleri yan yana yapar.
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
