package day33_methods05;

public class MethodsPractice3 {

	public static void main(String[] args) {
		
		// ### Calculation Test ###
		
		System.out.println(MethodsPractice1.add(3,1));
		
		System.out.println(MethodsPractice2.multiply(5, 6));
	
		System.out.println(MethodsPractice2.minus(40, 12));
		
		System.out.println(MethodsPractice2.divide(100, 2));
		
		System.out.println("****************************************************************************************");
		
		int addResult = MethodsPractice1.add(21, 41);
		double mResult = MethodsPractice2.multiply(50, 40);
		double miResult = MethodsPractice2.minus(3000, 200);
		double dResult = MethodsPractice2.divide(455, 5);
		
		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("miResult: " + miResult);
		System.out.println("dResult: " + dResult);
		
		System.out.println("*****************************************************************************************");
		
		double a = 10.0, b = 5.0;
		double myResult = MethodsPractice2.minus(a, b);
		System.out.println("myResult: " + myResult);
		
		System.out.println("*****************************************************************************************");
		
		double[] dNums = {2.0, 4.0};
		double result2 = MethodsPractice2.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		
		System.out.println("******************************************************************************************");
		
		if(MethodsPractice1.add(10,16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit test failed");
		}
		
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 character");
		}else {
			System.out.println("It is not 4 vharacters");
		}

	
	
	}
}
