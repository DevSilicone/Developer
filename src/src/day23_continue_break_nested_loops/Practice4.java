package day23_continue_break_nested_loops;

public class Practice4 {

	public static void main(String[] args) {
		
		//write a for loop will print letter from a to z
		
		
		// OUTER LOOP will repeat printing of letter as many times as want
		// in this case we will do 3 times
		// so we are reaoting inner loop 3 times
		
		for(int i = 0; i < 3; i++) {
		
			for(char letter = 'a'; letter <= 'z'; letter ++) {
			System.out.print(letter);
			
			}System.out.println();
			System.out.println("******************************");  // outer loop parantezi icine alinca alt alta islem yapiyor.
		
		}
		
	}
	
}
