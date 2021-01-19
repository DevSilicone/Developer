package day46_static_keyword;

public class X11_CampusRunner {

	public static void main(String[] args) {
 
		X10_Campus campus1 = new X10_Campus("McLean");			// it runs one time very begging // bastaki calisti, gerisi hep ayni print.
		X10_Campus campus2 = new X10_Campus("Chicago");
		X10_Campus campus3 = new X10_Campus("New Jersey");

		
		X10_Campus.campusInfo();								// Static de acsak yine aynisi, basta bir kez calisir.
		X10_Campus.campusInfo();
		X10_Campus.campusInfo();
		X10_Campus.campusInfo();
		
		System.out.println(X10_Campus.country);     			// bunda da Canada print ediyor.
	
		
		
	}

}






