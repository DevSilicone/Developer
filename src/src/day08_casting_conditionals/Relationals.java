package day08_casting_conditionals;

public class Relationals {

	public static void main(String[] args) {
		
		double d1 = 23.56;
		double d2 = 20.43;
		
		System.out.println(d1 >= d2);
		
		boolean check = d1 >= d2;
		
		System.out.println("Check: " +check);

		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2 > ch1); // true 'j' > 'a'
		System.out.println(ch1 > ch3); // true 'a' > 'A' 
		// 'a' is greater than 'A' because, a is represented by 97, A is represented by 65.. 97>65 (ASCII table)
		
		System.out.println("");
		
		// boolean b = true > false; // you can't compare boolean
		boolean c = true == false; 
		System.out.println("C: " + c); //false
		
		c = true != false;
		System.out.println("C: " + c); //true
			
		
		
	}

}
