package day30_methods02;

public class MethodsPractice5 {

	public static void main(String[] args) {
		
		//### EtsySearch  ###
		
		navigateToEtsy();
		navigateToEtsy();
		searchForWoodenSpoon();
		searchForWoodenSpoon();
		printResults();
		printResults();
		
		/**
		 navigateToEtsy();
		 searchForWoodenSpoon();
		 printResults();
		 "wooden spoon" (14,720 Results)
		 create the above 3 methods and call them in the main method.
		 */
	
	}

	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
		
	}

	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden spoon' into search field");
		System.out.println("Click on 'Search' button");
		
	}

	public static void printResults() {
		System.out.println("wooden spoon (14,720 Results)");
		
	}

}
