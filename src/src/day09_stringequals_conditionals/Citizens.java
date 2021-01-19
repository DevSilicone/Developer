package day09_stringequals_conditionals;

import java.util.Scanner;

public class Citizens {

	public static void main(String[] args) {
		
		//Declare veriables
		int seniorCitizens;
		int nonSeniorCitizens;
		
		int age;
		
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// ask user to enter count for seniorCitizens
		// and nonSeniorCitizens using message:
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens: ");
		
		seniorCitizens = input.nextInt();
		nonSeniorCitizens = input.nextInt();
		
		System.out.println("What is new citizen's age?");
		age = input.nextInt();
		
		if (age >= 65) {
			System.out.println("Senior Citizen");
			seniorCitizens++; //++seniorCitizens; , seniorCitizens+=1; , seniorCitizens=seniorCitizens+1;
			
		} else {
			System.out.println("Non-Senior Citizen");
			nonSeniorCitizens++;
		}
		
		System.out.println("");
		
		System.out.println("New seniorCitizens count: "+seniorCitizens);
		System.out.println("New nonSeniorCitizens count: "+nonSeniorCitizens);
	}

}
