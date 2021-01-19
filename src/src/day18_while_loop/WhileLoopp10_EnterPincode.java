package day18_while_loop;

import java.util.Scanner;

public class WhileLoopp10_EnterPincode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secretPincode = 1234;
		
		int pincode = 0;
		
		// keep asking pincode until correct one entered
		
		while (pincode != secretPincode) {
			System.out.println("Enter pincode:");
			pincode = input.nextInt();
					
					
		}
		
		// Access granted, select operation
		
		System.out.println("Access granted, select operation ");
		
		
		
		
		
	}

}
