package day32_methods04;

public class MethodsPractice3 {

	public static void main(String[] args) {
		
		// ### Methods With Return

		System.out.println(giveMe10$());
		
		int i = giveMe10$();
		System.out.println("i: " + i);
		
		System.out.println("*****************************************************************************************");
		
		System.out.println( giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("MyName is " + myName);
		
		
	}
	
	/**
	 this methop, returns int value
	 * */
	
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	
	/**
	 giveMeYourName()
	 return type: String 
	 Declare name variable and assign your name
	 then return it. Call in main method
	 * */
		
	public static String giveMeYourName() {
		String name = "Yavuz";
		return name;					// return "Yavuz"
	}
		
	
}
