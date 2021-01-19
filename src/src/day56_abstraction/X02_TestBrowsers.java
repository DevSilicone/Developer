package day56_abstraction;

public class X02_TestBrowsers {

	public static void main(String[] args) {
		
		// Browser br = new Browser();						=> you canNOT do that
		
		X01_Browser.id = 100;
		System.out.println(X01_Browser.id);
		
		
	}
	
}
