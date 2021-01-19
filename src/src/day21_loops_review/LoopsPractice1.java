package day21_loops_review;

import java.util.*;

public class LoopsPractice1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1+num2;
			//sumOfSums += sum; same way
		}while(sum <= 100 );
		
		
		
		System.out.println("Good Numbers");
		
		
		
		
		

	}

}
