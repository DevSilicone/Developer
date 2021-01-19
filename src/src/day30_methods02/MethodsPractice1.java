package day30_methods02;

public class MethodsPractice1 {

	
	public static void print5Stars() {
		
		System.out.println(" * * * * * ");

	}
	
	
	public static void main(String[] args) {
		
		// WarmUp Methods
												//==> cogunlukla tercih edilen main method'u yukari yazmak ama boyle de calisir.
		print5Stars();
		print5Stars();
		print5Stars();
		print5Stars();
		print5Stars();
		print5Stars();
		
		
		// call print5Stars 100 times
		
		for (int i = 1; i < 100; i++) {		// ==> 100 defa print yaptirdik.
			print5Stars();
			
		}
	}

		
}
	
	