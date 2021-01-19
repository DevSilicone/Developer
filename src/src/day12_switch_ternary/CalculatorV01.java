package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();
		
		System.out.println("Select Operator: +, -, *, /, % ");
		String operator = input.next();
		
		System.out.println("Enter second number: ");
		double num2 = input.nextDouble();
		
		//assign 0.0 to prevent compile errors.due to not having any value.
		double result = 0.0; // (bir deger atarsan kod genelde hatasiz olur))
		
		//perform calculation and display result
		if(operator.equals("+")) {
			result = num1 + num2;	
		}else if(operator.equals("-")) {
			result = num1 - num2;
		}else if(operator.equals("*")) {
			result = num1 * num2;
		}else if(operator.equals("/")) {
			result = num1 / num2;
		}else if(operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator selected: " + operator);
			return;  // Do not execute the remaining code.STOP HERE
		}
		
		System.out.println("Result: " + result);
	  //System.out.println("Result: " + Math.round(result);
	
	
	}

}
