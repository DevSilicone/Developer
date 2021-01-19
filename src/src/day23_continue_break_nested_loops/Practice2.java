package day23_continue_break_nested_loops;

public class Practice2 {

	public static void main(String[] args) {
		
		// #### PRINT NUMBERS 2 ####
		
		
		for (int i = 1; i <= 50; i++) {
			
			if(i %20 == 0) {
				break;
			}
			
			if (i %5 == 0) {
				continue;
			}
			
			System.out.print(i + ",");
		}
		
		
		
		
		
		
		
		
		

	}

}
