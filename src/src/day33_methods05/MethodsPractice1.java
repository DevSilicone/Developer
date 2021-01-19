package day33_methods05;

public class MethodsPractice1 {

	public static void main(String[] args) {
		
		// ### Calculator ###
		
		addVoid(2, 5);		
		
		//below line will not work because addVoid does not return a value. it just perform action.
		//int result + addVoid(5, 1);

		int result = add(4, 8);
		System.out.println("Result: " + result);
		
		result = add(10,30);
		System.out.println("Result: " + result);
		
		System.out.println(add(6,2));
		
		//result = addVoid(5,1); => there is no return these veriable beacuase its not work.
		
		add2(8, 5);
		
	}

	/**
	 method addVoid
	 return type: void
	 params: int num1, int num2,
	 add them and print sum
	 * */
	
	public static void addVoid(int num1, int num2) {
		
		int sum = num1 + num2;
		
		System.out.println("Sum: " + sum);	
	}
	
	/**
	 method name: add
	 return type : int
	 params: int num1, int num2
	 add them and return the sum
	 * */
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
		

	public static int add2(int num5, int num6) {
		
		int sum = num5 + num6;
		System.out.println("Sum: " + sum);
		return num5;
	}	
}
