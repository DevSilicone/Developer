package day23_continue_break_nested_loops;

public class Practice7 {

	public static void main(String[] args) {
		
		
		// #### PRINT NUMBER 10 TO 1, 10 TIME #####   REVERSE ORDER === TRINGLE
		
				// outer loop
				for (int j = 10; j >= 1 ; j--) {
					
					// inner loop	 <=> j YAZARSAN TRIANGLE olarak print eder. yani ucgen olarak.
					
					// 		(i = j; i >= 1; i--) ==> bu secenek de ayni sonucu verir.
					for(int i = 1; i <= j; i++) {
						
						System.out.print(i+" ");
					}
					
					System.out.println();	
				}
			}
	
	}


