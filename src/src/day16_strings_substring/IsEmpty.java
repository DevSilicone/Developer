package day16_strings_substring;

public class IsEmpty {

	public static void main(String[] args) {
		
		
		
		
		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());
		
		if(userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
		

		if(userName.length() == 0) {   // ##### length() == 0 (empty) demek 
			System.out.println("Username length is 0, so it is empty");
		}
		
		
	}

}
