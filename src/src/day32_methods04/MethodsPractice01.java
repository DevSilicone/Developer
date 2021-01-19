package day32_methods04;

public class MethodsPractice01 {

	public static void main(String[] args) {
	

		// ### Calculator ###
		
		addVoid(2, 5);		
		
	
//		=========================================		
		add2(8, 5);
		
		int result = add(4, 8);
		System.out.println("Result: " + result);
		
		result = add(10,30);
		System.out.println("Result: " + result);
		
		add(6, 2);
		System.out.println("sum : " + add(6,2));
	}

	public static void addVoid(int num1, int num2) {
		
		int sum = num1 + num2;
		
		System.out.println("Sum: " + sum);	
	}
	

	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
		

	public static int add2(int num5, int num6) {
		
		int sum = num5 + num6;
		System.out.println("Sum: " + sum);
		return sum;
	}
	
	
}
