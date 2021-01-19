package day07_scanner_operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == 
		System.out.println(5 == 5); //true
		System.out.println(50 == 5); //false
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000); //true
		
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount); //false
		

	}

}
