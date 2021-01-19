package day08_casting_conditionals;

public class ImplicitCasting {

	public static void main(String[] args) {
		
		// automatic casting from smaller to larger type
		
		short shortValue = 3455;
		int intValue = shortValue;
	  //int intValue = (int) shortValue;  // there is no need to put paranthesis (int)
		System.out.println("int value: " + intValue);
		
		System.out.println("");
		
		double price = 345;
		System.out.println("Price after casting: " + price);  // auto add.
		
		System.out.println("");
		
		int price1 = 34563;
		double dPrice = price1;
		
		System.out.println("dPrice after casting: " + dPrice); // auto add
		
		

	}

}
