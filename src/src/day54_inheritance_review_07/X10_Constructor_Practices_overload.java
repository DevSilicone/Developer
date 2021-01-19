package day54_inheritance_review_07;

public class X10_Constructor_Practices_overload {

	public X10_Constructor_Practices_overload(int a, double d, boolean b) {		//=> contructor has 3 arguments
																			//=> constructor execute when you create object
		System.out.println("Number is: "+a);
		System.out.println("GPA is: "+d);
		System.out.println("Passed: "+b);
		
	}
		
	public static void main(String[] args) {

//		Constructor_Practices_overload obj = new Constructor_Practices_overload(100, 4.0, false);		//=> burayi yukaridan cagirip object yaptik
	
		child obj2 = new child();				//=> baska degerler verdigimiz icin sub classtaki degerler gelecek
												//=> burasi da sub class'tan cagirdik
	}	
		
}




class child extends X10_Constructor_Practices_overload{					//=> sub Class MUST super class constructor
																	//=> eger default varsa gerek yok
	public child() {
		super(200, 6.0, true);
		}		
	}

