package day54_inheritance_review_07;

class parent {
//	=> super class can have MULTIPLE sub classes.
	
	static int num1;	//=> inheritible		   => 1) class variable			=>	inheritible					=> dogrudan yazilabiliyor (sys.out.println(num1))
			int num2;	//=> inheritible		   => 2) instance variable		=>	it can be inherited.		=> it's belong to the OBJECT.
						//					   	   =>	 static variable' a ulasabilmesi icin object create etmek gerek
	
	
	
	public void method1() {						// => 3) instance method		=>	inheritible					=> object create etmek gerek
		
	}
	
	
	public static void method2() {				// => 4) static method			=>	inheritible in sub class
		System.out.println("Method2");
	}
	
	
	parent(){
		System.out.println("Constructor");		// => 5) constructor			=>	NO 							=> CAN NOT be INHERITED
	}
	
												// => 6) 						=>	inheritible
	// => 6) belongs to the CLASS
												// => 6) static blok it's going to be execute as soon as class is load it.
	static {									// => 6) static blok			
		System.out.println("Static blok");
	}											// => 6) How many time STATIC BLOK is goign to be execute for per class (ONLY ONE)
												// => 6) If you have three object ( doesn't matter, only one)
	
	
												// => 7) 						=>	inheritible
	// => 7) belongs to the OBJECT	
	{											// => 7) it's only execute when you create the OBJECT
		System.out.println("Instance blok");	// => 7) instance blok			
	}											
												// => 7) How many time INSTANCE BLOK is goign to be execute for per class (????)
												// => 7) If you have three object ( THREE times)
	
	
	private	void methodB() {					// => 8) instance method		=> NO							=> it can not be accessible(visible) outside the class.
		
	}
	
	
//	BU KISIM INHERITED OLAMAYANLAR ama bazi sartlarda bazilari olabilirler de.
//
//	features that canNOT be INHERITED:	1)	Constructor, 
//										2)	features that are not visible:
//															1- private (access modifier)
//															2- default (access modifier) (when sub class and super class  are not in same package.

//										3) 	Abstract method (if sub class is not abstract)
	
	
	
}

// 	class class3 {								//=> boyle bir sey mumkun degil. sub CLASS yalnizca bir tane SUPER class'i olur.
	
//	}

	class class3 extends parent{				//=> bu sekilde yapilabilir. Anlami bir kac veya daha fazla sub class olabilir, PARENT class'a bagli
		
	}


//	=========================================================================================

public class X02_InheritanceReview extends parent{
	// 			sub						super
	
	// only private can NOT "inherited" in sub class. Only in same class.
	// sub class can only have one super class.
	
	public static void main(String[] args) {
		
															//=> 1-2) (public static void main(String[] args) belongs to do parent class.
															//=> 1-2) bu sebeple burada object create etmeden dogrudan alamiyoruz. num2'yu													
	//	OBJECT	
		System.out.println(num1);							//=> 1) static int num1 			=> class variable	
		System.out.println(new X02_InheritanceReview().num2);	//=> 2)     	int num2			=> instance variable
															
	//		              (new parent().num2)				//=> 2) inheritible oldugu icin hem sub class hem de parent class'tan alinabilir
															//=> 2) bu da parent class olarak call edilmis hali
															
															/*	 3) in since static method (public static void main(String[] args)) it belongs to the class, 
															 *	 in order to calls instance when of object, you need call through the object
															 *	 yani eger "method1()" buraya cagirildiginda, object olusturulmak zorunda. class'a ait oldugu surece.
															 */	
		System.out.println(new parent().num2);				//=> 3) instance method
	//					(new InheritanceReview().method1();	//=> 3) in static method how to call "instance method" by creating the object of the class.
															//=> 3) burada da CLASS'in OBJECT'ini olusurutup cagiriyoruz.
															//=> 3) we can create which class subject? => both is gonna work (
		
		method2();											//=> 4) How do I call STATIC method in main METHOD, Do I need to create object first of all?
															//=> 4) if we don't have EXTENDS keyword, we can call with parent.method2()
															//=> 4) because static methods belong to the Class. As soon as you declared as static it's already shared with the class.
															//=> 4) yani static method yukarida class'in icerisinde oldugu icin, extend etmediysek parent.method2() ile cagirabiliyoruz.
															//=> 4) extend ettiysek zaten direk method2() yazip cagirabiliyoruz.

	//	("Static blok")										//=> 5) it's execute as soon as the class load it.	=> dogrudan calisir, buraya bir sey yazmazsin.
															//=> 5) ONLY one time.
		
		
	//	("instance blok")									//=> 6) it's execute when you create the OBJECT.
	//	new InheriranceReview()								//=> 6) if you have 3, 3 time run. ( it depends what you have
															//=> 6) CONSTRUCTOR and INSTANCE blok
															//=> 6)	INSTANCE BLOCK first execute, then CONSTRUCTOR execute(inherited olmamasina ragmen, instance blok icin object olusturdugunda iki de calisir.
															//=> 6) because SUPER class no-arg CONSTRUCTOR is called in the SUBCLASS. BY DEFAULT
															//=> 6) even if you DON'T call it, thats call BY DEFAULT.
	}
	
	
	public void methodA() {									//=> can I call num2 without create object? YES
															//=> BECAUSE OBJECT it can ACCEPT OBJECT		=> bu  yuzden yukaridaki OBJET'den direk alabiliyoruz.
		num2=300;											//=> because num2 was inheritible
		
		

		
	// FINAL class canNOT have sub class.		
		
		
	}
		
}
