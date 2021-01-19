package day19_do_while_loop_02;

import java.util.Scanner;

public class DoWhile_EnterPassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;
		
		do {
			System.out.println("Enter password");
			input = scan.next();
		}while(!input.equals(password));		// if in put is not same as password, keep asking to enter
	
		
		

	}

}
