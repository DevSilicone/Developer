package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
		
		// cast double value to int
		
		int i = (int)3.4; // will remove.4
		
		System.out.println("i : "+ i);
		
		System.out.println("");
		
		double price = 230.50;
		int dollars = (int) price;
		
		System.out.println("Price: "+ price);
		System.out.println("Dollars: "+ dollars);
		
		System.out.println("");
		
		//WHOLE NUMBERS. byte, short, int
		
		int count = 130;
		byte byteCount = (byte) count;
		
		System.out.println("ByteCount: "+ byteCount);
		
		System.out.println("");
		
		long longValue = 345645L;
		int intValue = (int) longValue;
		
		System.out.println("");
		
		System.out.println("Int value: " + intValue);
		
		int large = 5678;
		short small = (short) large;
		
		System.out.println("small ; " + small);
		
		System.out.println("");
		
		//  250		  250      250.2
		int result = (int)(500.4 / 2.0);
		
		System.out.println("Result: " + result);
		
	}
}
