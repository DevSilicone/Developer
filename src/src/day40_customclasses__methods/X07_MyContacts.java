package day40_customclasses__methods;

public class X07_MyContacts {

	public static void main(String[] args) {
		
		// create Contact object
		
		X06_Contact evgenia = new X06_Contact();
		
		evgenia.name = "Evgenia Jalilova";
		evgenia.phoneNumber = "(202) 333-4444";
		evgenia.email = "evgenia@thorlabs.com";

		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();
		
		System.out.println();
		
		X06_Contact orhan = new X06_Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571)991-3322";
		orhan.email = "orhan@google.com";
		
		System.out.println("Name: " + orhan.name);
		System.out.println("PhoneNumber: " + orhan.phoneNumber);
		System.out.println("Email: " + orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		System.out.println();
		
		evgenia.call();
			
	}

}
