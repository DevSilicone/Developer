package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		
		String str1 = "Good morning";
		// check if it matches "Good Morning" and print match
		// or not match
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		
		// Convert to All uppercase and print
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old value. not uppercase
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);

		//===============================================================
		
		// combine the above methods together:
		// convert to all lowercase
	
				//good morning ==> good morning
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
	
		// FIND OUT HOW MANY CHARACTERS IN THE STRING
		
		
		String myName = "Yavuz";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: "+ length);
		
		//========================================================================
		
		// usernames must be exactly 8 characters.
		// set some value and using a if statement check it is
		// 8 characters: if true => valid username. false => invalid username
		// must be 8 chars
		String userName = "password";
		
		if(userName.length() == 8) {
			System.out.println("Valid username");
		}else {
			System.out.println("InValid username, must be 8 chars");
		}
	
		// password must be at least 6 characters
		String password = "woodenSpoon";
		
		//1)
		if(password.length() >= 6) {
			System.out.println("Pasword is good");
		}else {
			System.out.println("Password is too short");
		}
		
		int passwordLength = password.length();
		
		if(passwordLength <= 6) {
			System.out.println("Invalid password. Too short");
		}else {
			System.out.println("valid password, good job");
		}
		
		
		
	}
}
