package day33_methods05;

public class MethodsPractice2 {

	public static void main(String[] args) {
		
		// ### Multiply method ###

		
	

		
	}
	/**
	 method: multiply with return vallue
	 method: minus with return value
	 method: divide with return value
	 * */
	
	public static double multiply(double num1, double num2)  {
		double result = num1 * num2;
		return result;
		
		//return num1 * num2;
	}
	
	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
		//return num1 - num2;
	}
	
	public static double divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("ERROR: Cannot / by 0");
			return 0;
			//System.exit(); // stop the whole code
		}else {
			double result = num1 / num2;
			return result;
		}
	}
	
	
	
}
