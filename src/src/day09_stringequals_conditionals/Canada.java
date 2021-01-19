package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		
		String capital = input.nextLine();
		
		  
		//IMPORTANT  // .equalsIgnoreCase() => will not be case sensetive
		if (capital.equals("Ottawa")) {
			
			System.out.println("Your answer is correct!");
		} else {
			System.out.println("Your answer is incorrect! " +capital+ " is not capital of Canada.");
		}
		

	}

}
	
