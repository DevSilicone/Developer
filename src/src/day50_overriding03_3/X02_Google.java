package day50_overriding03_3;



public class X02_Google extends X01_SearchEngine {
	
	// NO FLEXIBILTY 
	
	
	// protected int search(String item) {	
	// NIYE PROTECTED YAPIYORSUN diyor. mumkun ama gereksiz. PRIMITIVE		// asagidaki public - daraltma yapiyorsun erisimde, neden diyor, OLMAZ.
		
	@Override
	public int search(String word) {			// burada tek degisiklik item icin yapilabilir (String degisemez) hicbiri degisemez.
		System.out.println("Google Searching for: " + word);
		int resultsCount = word.length();
		return resultsCount;
	}
	
	
	//protected void search (String item, String item2) {	// VOID // PROTECTED -> PUBLIC olabilir -> VISIBLE cunku -> bunda sorun cikarmiyor
	
																// 		
	public void search (String item, boolean item2) {			// boolean (normalde String idi orada)
		System.out.println("Searching for 2 items: " + item + " , " + item2);
		int resultsCount = item.length();						// overriding(YAPMADIK) - > (overloading) yaptik
		System.out.println("Total count: " + resultsCount);		// overloading (Same name DIFFERENT parameter)
			
	}
	
	// protected String clickResult() {  =>	default
	// public String clickResult() {	 =>	default 
	
	String clickResult() {														// OBJECT
		System.out.println("Clicking result");
		return ("Search result page");
	}
	
		

}
