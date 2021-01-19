package day15_strings_manipulation;

public class IndexOf2 {

	public static void main(String[] args) {
		
		// ### index of with 2 inputs ###
		
					 //0123456789
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash: "+firstDash);
		
		int secondDash = list.indexOf("-", 5); 				//## 5 means start from number five to count
		System.out.println("Second dash: " + secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);				//## also  list.indexOf("-", 15)
		System.out.println("Third dash: " + thirdDash);	
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);
		
		
		//========================
		System.out.println();
		//========================
		
		String word = "java";
		
		int seconda = word.indexOf("a",2);
		System.out.println("Second a number is: " +seconda);
		
		int first = word.indexOf("a");
		int second = word.indexOf("a",first+1);					// same way
		System.out.println("Second 'a' number is " +second);	// same way
		

	}

}
