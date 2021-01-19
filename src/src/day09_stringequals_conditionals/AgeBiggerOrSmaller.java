package day09_stringequals_conditionals;

import java.util.Scanner;

public class AgeBiggerOrSmaller {

	public static void main(String[] args) {
		
		int age1, age2, age3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age 1:");
		age1 = scan.nextInt();
		
		System.out.println("Enter age 2:");
		age2 = scan.nextInt();
		
		System.out.println("Enter age 3:");
		age3 = scan.nextInt();
		
		
		if (age1>age2 && age1>age3) {
			System.out.println("age1 is bigger");
		}else if(age2>age3) {
			System.out.println("age2 is bigger");
		}else {
			System.out.println("age3 is bigger");
		}
		

	}

}
