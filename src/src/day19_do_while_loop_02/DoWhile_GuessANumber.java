package day19_do_while_loop_02;

import java.util.*;

public class DoWhile_GuessANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Random random = new Random();			// is used to generate random numbers
		
		
		
		System.out.println("WELCOME TO GUESS A NUMBER NAME");
		
		int secretNumber = random.nextInt(101); // this will give us a number between 0-100
		int guessNumber;
		
		do {
			System.out.println("Guess Number: ");
			guessNumber = scan.nextInt();
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber != secretNumber);
		
		
		System.out.println("Bingo, Congratulations, you won!");
		
		
	}

}
