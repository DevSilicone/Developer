package day63_exceptions02;

public class X05_MethodsWithThrows {

	public static void main(String[] args) throws Exception {
		/*
		 * We are calling a method that throws a CHECKED exception.
		 * We must either HANDLE or DECLARE it for compile
		 * */
		try {
			playWithMatches();
		}catch (Exception e) {
			System.out.println("STOPPED the fire with Extinquisher");
		}
		
		playWithMatches();
		
		playSoccer();
		
		throw new X06_InsufficientFundsException();
		
	}	
		
	// THROWS CHECKED EXCEPTION
	public static void playWithMatches() throws Exception {
		System.out.println("Playing with matches can cause fire");
	}
	// THROWS UNCHECKED EXCEPTION	
	public static void playSoccer() throws RuntimeException {
		System.out.println("Playing soccer with friends");
	}
	
	
	
}
