package day54_inheritance_review_07;

import java.util.*;

class cyber{
	
	
	{																//=> 
		super.getClass();
	}
	
	
	
	
}

public class X11_This_Super extends cyber {
	/*
	 * this & super: refers to object instances.
	 * 																	=> (in static method -> there is no object instances)
	 * 			this: refers object instance in the class				=> (class -> any method has static keys)(main method also static method)
	 * 					=> calls the instance methods, insrance variables.
	 * 					=> can only be used at: constructor, instance block, instance method
	 * 
	 * 			this()	=> can only be used in CONSTRUCTOR, in same class (super or sub)
	 * 
	 * 			super: refers object instance in super class
	 * 					=> calls the instance methods, insrance variables. from SUPER class
	 * 					=> can only be used at constructor, instance blok, instance blok methods
	 * 			super() => can be used in constructor
	 * 
	 * */
													
	
	boolean result1;								//=> those are instance variable
	String str1;
	double decimal;
	
	
	static char ch;									//=> if any member static belongs to the class (static field and super should be access instance static way) 
	
	
													//=> CLASS METHOD
													//=> any method belongs to the object	(yani instance degiller)
													//=> burasi class method 		=> this veya super kullanamazsin.
	public static void main(String[] args) {		//=> (in static method -> there is no object instances)
	//	this.result1 = true;						//=> there is no object instances
	}												
													//=> STATIC BLOK
													//=> any blok belongs to the object	(yani instance degiller)
	static {										//=> burasi static blok this veya super kullanamazsin
	//	this.result = true;							//=> there is no object instances (give compiler error)
	}
	
	
	
	public X11_This_Super() {							//=> CONSTRUCTOR
		this.result1 = true;						//=> compile => constructer is object instance => its belongs to the object => that's why we can use it.
		this.str1 = "obj";
		this.decimal = 0.9;
		
//		this.ch='7';								//=> bu da warning vermez ama run da olmaz. YANI YAPMA BU HATAYI	=> SEBEP static
//		new This_Super().ch='p';					//=> bunlar warning vermez ama run da olmaz. YANI YAPMA BU HATAYI	=> sebep static
		ch = 'l';									//=> dogrusu bu		=> static dogrudan static olana ulasabilir		=> you can call through to class name
		X11_This_Super.ch = 'o';						//=> dogrusu bu		=> static dogrudan static olana ulasabilir		=> you can call through to class name
		
	}
	
	public void instancemethod() {					//=> INSTANCE METHOD
		this.result1 = true;						//=> 
	}
	
	{												//=> IN-IT BLOCK (INSTANCE BLOK)
		this.result1 = true;
	}

// 	=> the future has to be in the object => if the future does NOT belongs to the object you can use THIS-SUPER keyword.
	
	
	
//	=> burada static yaptigin zaman asagidakilerin hepsini istedigin yerde kullanabilirsin	
	static Scanner scan = new Scanner(System.in);	//=> you can also use instance blok, static blok every where in the class( if you declare it as static(everyweherr)
	
	public void scan1() {							//=> instance method
		String A = scan.next();
	}
	
	public static void scan2() {					//=> static method
		int B = scan.nextInt();
		}
	
	X11_This_Super(char c){
		boolean b = scan.nextBoolean();				//=> constructor
	}
	
	}
	

