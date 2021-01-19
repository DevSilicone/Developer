package day09_stringequals_conditionals;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		int side1, side2, side3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side 1:");
		side1 = scan.nextInt();
		
		System.out.println("Enter side 2:");
		side2 = scan.nextInt();
		
		System.out.println("Enter side 3:");
		side3 = scan.nextInt(); 
		
		
		    if(side1==side2 && side2==side3) {
		        System.out.println("Equilateral triangle.");
		    }else if(side1==side2 || side1==side3 || side2==side3) {
		        System.out.println("Isosceles triangle.");
		    }else {
		        System.out.println("Scalene triangle.");
		    }

		 
	
	} 
}
