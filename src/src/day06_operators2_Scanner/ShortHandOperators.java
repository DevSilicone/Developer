package day06_operators2_Scanner;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		// plus some
		
		int students = 45;
		
		System.out.println("Students: " + students);
		
		students = students + 5;
		
		System.out.println("Students: " + students);
		
		students+=15; // increase students by 15
		
		System.out.println("Students: " + students);
		
		
		//=========================================
		
		// minus some
		
		students = students - 2;
		
		System.out.println("Students: " + students);
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		
		teachers+=2; // increase teachers by 2.
					 // teachers = teachers + 2
		System.out.println("Teachers: " + teachers);
		
					 //teachers = teacher -5;
		
		teachers -=5; // decrease teachers by 5
		
		System.out.println("Teachers: " + teachers);
		
		//==========================================
		
		int cars = 12;
		
		System.out.println("Cars: "+ cars);
		
		cars *= 2;  // cars = cars * 2; // these same 
		System.out.println("Cars: " + cars);
		
		cars += cars;
		System.out.println("Cars: "+ cars);
		
		int shoes = 20;
		shoes /= 4; // shoes = shoes / 4
		
		System.out.println("Shoes: " + shoes);
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println("price is " + price);
		
		int minutes = 66;
		minutes %= 60; //minutes = minutes % 60
		System.out.println("Remaining: " + minutes);
		
		int pennies = 550;
		pennies %= 100; // pennies = pennies % 100
		System.out.println("Pennies left: " + pennies);
		
		int apples = 10;
		apples =-3; // assign -3 to apples
		System.out.println("apples; " + apples);
		
		int apples1 = 10;
		apples1 -=-3; 
		System.out.println("apples1; " + apples1);
		
		
		
	}

}
