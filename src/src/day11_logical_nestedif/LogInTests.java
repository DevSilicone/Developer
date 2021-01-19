package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = input.nextLine();
		
		System.out.println("Enter pasword:");
		String password = input.nextLine();
		
		String validUsername = "gmail@gmail.com";
		String validPassword = "Woodoon12";
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		}else if( !username.equalsIgnoreCase(validUsername)) {
			System.out.println("Invalid Username and Invalid Password");
		}else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		

	}

}
