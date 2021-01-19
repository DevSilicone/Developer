package day31_methods03;

import java.util.*;

public class MethodsPractice1 {

	public static void main(String[] args) {
		
		// ### Counter ###

		countUp(0);		// num = invalid input
		countUp(-5);	// num = invalid input
		countUp(10);	// num = 10;
		countUp(10);
		countUp(5);
		
	  //countUp("hi!"); will not work
		int n = 5;
		countDown(7);	// num = 7;
		countDown(0);	// num = invalid input
		countDown(-1);	// num = invalid input
		countDown(n);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		
		int inputNum = scan.nextInt();
		
		countUp(inputNum);
	
	}

	public static void countUp(int num) {
		
	/**
	 1)
	 name: countUp
	 return type: void
	 param: int
	 it prints from 1 to the value of the param
	 countUp(5);
	 1 2 3 4 5
	 int j;
	 String str;
	 
	 param value less than 1 then
	 print "invalid input"
	 **/
		if(num < 1 ) {
			System.out.println("Invalid input");
		}else {
			for(int i = 1; i <= num; i++) {
			System.out.print(i + ", ");
			}
			System.out.println();
			System.out.println("*************************************************************************************************");
		}
	 	
	}
	
	/** 
	 2)
	 name: countDown
	 return type: void
	 param: int
	 it prints from param value till 1
	 countDown;
	 
	 **/
	
	public static void countDown(int num) {
		if( num < 1) {
			System.out.println("Invalid input");
		}else {
			for(int n = num; n >= 1; n-- ) {
			System.out.print(n + ", ");
		}
		System.out.println();
	}
	
	}	
	
	
	
	
}
