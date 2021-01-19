package day19_do_while_loop_01;

import java.util.Scanner;

public class loop1_transactions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your curent balance?");
		double balance = input.nextDouble();
		
		int count = 0;
		
		while(balance > 0) {
			count++;										 // increase transaction by 1
			System.out.println("What is transaction #" +count+ " amaount?");
			double transaction = input.nextDouble();
			if(transaction>balance) {
				// continue ===> go on top of loop right away
				System.out.println("Your balance is about to be negative due to tis transaction");
			}
			balance -= transaction; 						// balance = baance - transaction; (same)
			System.out.println("Current balance: " +balance);
		}
		
		
		
		System.out.println("You have insufficient funds for any more transactions, you balance is " + balance);
		System.out.println("Transactions total count: "+ count);
		
	}

}
