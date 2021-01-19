package day50_overriding03_3;

public class X01_SearchEngine {

	
	
	public int search(String item) {											// PRIMITIVE
		System.out.println("Searching for: " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	
	
	
	
	protected void search (String item, String item2) {							// VOID
		System.out.println("Searching for 2 items: " + item + " , " + item2);
		int resultsCount = item.length();
		System.out.println("Total count: " + resultsCount);
		
	}
	
	
	
	
	
	String clickResult() {														// OBJECT
		System.out.println("Clicking result");
		return ("Search result page");
	}
	
	
	
	
	
	
}
