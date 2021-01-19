package day20_for_loop;

public class EvenOrOdd {

	public static void main(String[] args) {
		// if statements 
		// using for loop: 1-100
		// 1.print all even numbers in same line

		for(int n = 1; n <= 100; n++) {
			if(n  % 2 == 0) {				//==> check if it is even
				System.out.print(n+" ");
			}
		}
		
		System.out.println();   // ===> for seprate line
		
		//2. print all odd numbers in same line
		
		for(int j = 1; j <= 100; j++) {
			if(j % 2 != 0) {
				System.out.print(j+ " ");
			}
		}
		
		
		//3. sumOfOdds, sumOfEvens - calculate them
		// and print out after the loop
		// sum of 1 - 10 mean (1+2+3+4+5+6+7+8+9+10) just examp.
		System.out.println();   // ===> for seprate line
		
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0) {
				sumOfEvens += num;
			}else {
				sumOfOdds += num;
			}
		}
		
		System.out.println("Sum of events: "+ sumOfEvens);
		System.out.println("Sum of odds: " + sumOfOdds);
		

		
		
	}

}
