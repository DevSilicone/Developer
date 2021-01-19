package day13_ternary;

public class Ternary02 {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 10;
		
		// variable = (boolean) ? value1 : value2
		
		b = (a==1) ? 20 : 30;
		
		System.out.println("Value of b is : " + b);
		
		
		b = (true || false) ? 40 : 57;
		System.out.println("Value of b is : " + b);
		
		// -> | -> tek olani binary equals'a bakiyor.
		
		
	}
}
