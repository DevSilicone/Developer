package day15_strings_manipulation;

public class Contains {

	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		System.out.println( email.contains("@"));
		
		
		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("It is yahoo email");
		}else if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		
		
		//===================
		System.out.println();
		//==================
		
		String list = "potatoes, tomatoes, eggs, milk, bread, cereal, meat";
		
		// check if apples is in the shopping list
		// true ==> Apples are there!
		// false == Lets add apples now!
		
		if(list.contains("apples")) {
			System.out.println("Apples are there");
		}else {
			System.out.println("Lets add apples now");
		}
		
		boolean hasEggs=list.contains("eggs");
		
		System.out.println("Contains eggs: "+hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
		
		System.out.println("Contains cucumbers: "+ hasCucumbers);
		
		//===================
		System.out.println();
		//==================
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		//===================
		System.out.println();
		//==================
	
		//Assign your name and check it contains "a" or "e" letters
		
		String name = "Yavuz";
		
		if(name.contains("a") || name.contains("e")) {
			System.out.println("'a' or 'e' present");
		}else {
			System.out.println("'a' or 'e' missing");
		}
		
		
		
		
	}

}
;
