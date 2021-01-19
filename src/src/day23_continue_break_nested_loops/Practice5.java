package day23_continue_break_nested_loops;

public class Practice5 {

	public static void main(String[] args) {
		
		//write a for loop will print letter from z to a
		
		
		// OUTER LOOP will repeat printing of letter as many times as want
		// in this case we will do 3 times
		// so we are reaoting inner loop 3 times
		
		for(int i = 1; i <= 3; i++) {
			
			// i -- it's an index
			// if index is even ( it means 2,4,6,8) print from z till a
			
			if(i %2 == 0) {
				for(char letter = 'a'; letter <= 'z'; letter ++) {
				System.out.print(letter);
			}
				
		// if index is odd (1,3,5,) print from z till a
		}else {
			for(char letter = 'z'; letter >= 'a'; letter --) {
				System.out.print(letter);
			}	
		}
			System.out.println();
			System.out.println("******************************");  // outer loop parantezi icine alinca alt alta islem yapiyor.
		
		}
		
	}
	
}


























