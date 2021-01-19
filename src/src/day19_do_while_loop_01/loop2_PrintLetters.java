package day19_do_while_loop_01;

import day14_string_methods.Words;

public class loop2_PrintLetters {

	public static void main(String[] args) {
		
		String word = "Amazon"; // print each character one by one in separate lines
		
		int idx = 0;
		
		while(idx < word.length()) {
			System.out.println(word.charAt(idx));
			idx++;
		}
		
		//==========================
		System.out.println();
		//==========================
		
		//PRINT EACH CHARACTER IN REVERSE ORDER
		
		int idx2 = word.length() - 1; //5
		
		while(idx2 >= 0 ) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
		
		
		//==========================
		System.out.println();
		//==========================
		
		//    OTHER METHOD
		
		/*
		 System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		*/
		
		
		
		
	}

}
