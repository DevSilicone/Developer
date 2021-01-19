package day18_while_loop;

import java.util.Scanner;

public class WhileLoop9_GiveMe5Dollars {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int dollars = 0;
				
		while(dollars != 5) {
			System.out.println("Give me 5 dollars.");
			dollars = input.nextInt();
		}
		
		System.out.println("Thank you for 5 dollars");
		
		
		
		
	}

}
