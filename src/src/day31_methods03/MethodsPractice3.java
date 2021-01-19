package day31_methods03;

public class MethodsPractice3 {

	public static void main(String[] args) {
		
		// ### Authentication ###

		login("mentoring@mentoring.com","mentor001");
		login("MENTORING@mentoring.com","mentor002");
		login("abc","1234");
	}

	/**
	 Name: Login
	 Return type: void 
	 2 String args/params: username, password
	 inside the method:
	 	validUsername = "mentoring@mentoring.com"
	 	validPassword = "mentor001"
	 	
	 if username and password match, print "Login Succesful! Welcome to Mentoring!"
	 if not: "Sign in failed!"
	 login("mylogin", "abc123");	
	 * */
	
	public static void login(String userName, String password) {
		String validUsername = "mentoring@mentoring.com";
		String validPassword = "mentor001";
		
		if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcome to Mentoring!");
		}else {
			System.out.println("Sign in failed!");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
