package day06_operators2_Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int employees = 50;
		System.out.println("Employees: " + employees);
		
		// every one is some way to add 1 
		
		++employees; // preincrement - add 1
		employees++; // add/ increment 1
		employees += 1; // plus
		employees = employees + 1; // plus
		System.out.println("Employees: " + employees);
		
		//================================================
		
		// every one is some way minus 1 
		
		employees--; // decrease by 1 
		--employees; // -1
		employees -= 1;
		employees = employees - 1;
		System.out.println("Employees: " + employees);
		
		
		

	}

}
