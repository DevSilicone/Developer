package day23_continue_break_nested_loops;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		
		// ### BRUTE FORCE ####
		
		Scanner scan = new Scanner(System.in);
		
		
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		
		String username = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts == 0) {
				System.out.println("You have exceeded number of attemt");
				System.out.println("This user has been deactiveted for 30 minutes");
				return;
			}
			attempts--;
			System.out.println("Please enter user name: ");
			username = scan.next();
			if(!username.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: "+ attempts);
				continue;
			}
			System.out.println("Please enter password: ");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
			    System.out.println("Attempts left: " + attempts);
			continue;
			}
			
		}while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login successful");
		
	}

}
