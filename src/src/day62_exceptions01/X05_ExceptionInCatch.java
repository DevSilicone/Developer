package day62_exceptions01;

public class X05_ExceptionInCatch {

	public static void main(String[] args) {

		String str = "10j";						// A
		
		try {
			int n = Integer.parseInt(str);		// B
			System.out.println(n);				// C
		}catch(NumberFormatException e) {
			System.out.println(str.charAt(10));	// D
			System.out.println("hello from the Catch block!"); // E
		}finally {
			System.out.println("Hello From Finally block!");	// F
		}
		System.out.println("BYE BYE");	//Z

	}

}
