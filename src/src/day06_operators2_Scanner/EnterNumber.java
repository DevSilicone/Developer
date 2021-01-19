package day06_operators2_Scanner;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in); // create Scanner object
			 // (scan)
		
		System.out.println("Enter a number:");
		
		int number = input.nextInt();
		
		System.out.println("You entered " + number);
		
		
		
	}

}
