package day46_static_keyword;

public class X06_CalcTests {

	public static void main(String[] args) {
		
		
		double result = X05_Calculator.plus(55,  7);
		System.out.println("result: " + result);
		
		result = X05_Calculator.minus(44, 14);
		System.out.println("result: " + result);
		
		
		X05_Calculator c = new X05_Calculator();
		System.out.println(c.multiply(4, 2));
		
		int i = Integer.parseInt("33");				// bu static oluyor
		System.out.println(Character.isDigit('5'));	// bu static oluyor
		
													// system.out.println => interview da soruyorlar
		//System.out								// system (class name), 
													//out (variable name), which is inside the class, a variable whic is a static variable thats why able to access it static way)  )
													//
		
					// println is => method name
		
		
		//System.out.println("Hi")					// its NOT STATIC
		
		
		
	}

}
