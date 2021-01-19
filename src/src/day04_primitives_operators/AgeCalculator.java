package day04_primitives_operators;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variable yearOfBirth and assign some year
		int yearOfBirth = 2000;
		
		// Declare variable currentYear and assign 2019
		int currentYear = 2019;
		// Declare variable age and calculate the age and
		// assign result to it
		int age = currentYear - yearOfBirth;
		// Print: if you are born in year
		// Then you are <> years old
		
		System.out.println("If you are born in "+yearOfBirth);
		System.out.println("Then you are "+age+" years old.");

	}

}
