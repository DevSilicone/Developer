package day16_strings_substring;

public class CapitalCity {

	public static void main(String[] args) {
		
		String str = "Moscow is a capital of Russia";
		// Baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Baku");
		System.out.println(str);
		
		//================
		System.out.println();
		//==================
		
		String email = "firstName_LastName@gmail.com";
		
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);

	}

}
