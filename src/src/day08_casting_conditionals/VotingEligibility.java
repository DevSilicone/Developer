package day08_casting_conditionals;

import java.util.*;

public class VotingEligibility {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * program to tell if you are eligible to vote
		 * votingAge = 18
		 * yourAge = take from scanner
		 * if you are eligible to vote:
		 * you are eligible to vote.
		 * you have been eligible for 3 years 
		 * else
		 * you are not eligible to vote
		 * you still have 3 more years to go
		 */
	
		int votingAge = 18;
		
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		
		
		if (yourAge >= votingAge) {
			int years = yourAge - votingAge;
			
			System.out.println("You are eligible to vote.");
			
			//System.out.println("You have been eligible for "+years+" years");
			
			System.out.println("You have been eligible for "+(yourAge-votingAge)+" years"); // parantez koymazsan compile olmaz
		} else {
			int moreYears = votingAge - yourAge;
			
			System.out.println("You are not eligible to vote");
			
			//System.out.println("You still have "+(-years)+" more years to go"); // birinci yol
			//System.out.println("You still have "+ moreYears +" more years to go"); // ikinci yol
			
			System.out.println("You still have "+(votingAge-yourAge)+" more years to go"); // ucuncu yol-(parantez koymazsan compile olmaz.
			
		}
		
	}

}
