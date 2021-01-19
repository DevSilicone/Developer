package day23_continue_break_nested_loops;

public class Practice6 {

	public static void main(String[] args) {

		// #### PRINT NUMBER 1 TO 10, 10 TIME #####
		
		// outer loop
		for (int j = 1; j <= 10; j++) {
			
			// inner loop	 <=> j YAZARSAN TRINGLE olarak print eder. yani ucgen olarak.
			for(int i = 1; i <= 10; i++) {
				
				System.out.print(i+" ");
			}
			
			System.out.println();	
		}
	}

}
