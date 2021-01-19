package day19_do_while_loop_01;

import java.util.Scanner;

public class loop3_Palindrome {

	public static void main(String[] args) {
		
		//######### VERY POPULER INTERVIEW QUESTION ######## 
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter word to test:");
		
		
		String word = "civic";
		String reversed = "";
		
		//loop through word in reverse order and
		//concetanate each character to reversed string
		
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		
		System.out.println(reversed);
		
		//compare if word and reversed are equal
		
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It s palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
