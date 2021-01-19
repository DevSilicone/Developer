package day36_wrapperclasses;

public class X01_WrapperClasses {

	public static void main(String[] args) {
		
		// #### WRAPPER CLASSES ####
		
		int n1 = 10;
		Integer n2 = new Integer(20);
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println("**************************************************************");
		
		
		double d1 = 44.5;				//=> younger brother
		Double d2 = new Double(123.1);	//=> big brother (object, more behavier)
		Double d3 = new Double("5.2");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		
		System.out.println("**************************************************************");
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println("**************************************************************");
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)10); //=> bu farkli
		Byte b3 = new Byte ("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1 + b2 + b3);
		
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
		
		// 1) way
		Integer num1 = Integer.valueOf(1234);
		Integer num2 = Integer.valueOf("5");
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("false");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("**************************************************************");
		
		
		
		
	}

}
