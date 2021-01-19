package day54_inheritance_review_07;

class example1{											//=> this class has a constructor (bos ike alt tarafinda hic bir cons. yokken default olarak geliyor.
	
	public example1() {
		
	}
	
	public example1(int a) {
		System.out.println("Constructor1");

	}
	public example1(double a) {
	//	example1(9);									//=> hata verir, because 	=> constructor canNOT be caled by constructor name.
		
		System.out.println("Hello");					//=> Constructor' body constructor call needs to be at first step
														//=> yani asagidaki this bunu uzerinde olacak, yoksa compiler error veriyor.
	
	//	this(300);										//=> constructor'i diger constructor'a ismi ile cagiramiyoruz. THIS kullaniyoruz.
	}

	public void methodE() {								//=> constructor degil.
	//	this(300);										//=>  constructor can only be called in other constructor. BU SEBEPLE cagiramayiz
		
	}
	
	public example1(float a) {							//=> constructor
	//	this(19.5);										//=> constructor canNOT call ITSELF
	}
	
	public example1(char a) {
		this(20f);
	//	this();											//=> constructor can only one constructor.
	}
	
	
class example2{											//=> ikiciye ayrica actigimiz bir constructor	=> 10. madde icin
	private example2() {								//=> not visible 
		
	}
}
	
	
}


public class X07_Constructor {								//=> no arg constructor				=> you can only have ONE PUBLIC CLASS on the page. 
	
	/* what is constructor is a method
	 * 
	 * 		=> every class MUST	have constructor		
	 * 
	 * 		=> special method 
	 * 		=> belongs to the instance object 
	 * 		
	 * 		=> NOT SAME with REGULAR METHOD
	 * 		=> NO RETURN TYPE 		(can not have)		=> void, primitives, wrapper class, all objects
	 * 		=> NO ACCESS MODIFIER
	 * 		=> NO SPECIFIER			(can not have)		=> final, static, abstract
	 * 		
	 * 		=> Method name MUST be same CLASS name.		=> acmis oldugumuz class name ile ayni olmak zorunda
	 * 
	 * 		=> mandatory in every single CLASS	
	 * 
	 * 		=> constructor you can call it in the constructor ONLY
	 * 
	 * 		=> constructor execution depends on the creation of object	( same with instance block, after instance block)
	 * 
	 * 		=> constructor canNOT be caled by constructor name.
	 * 
	 * 		=> constructor can only be called in other constructor.
	 * 
	 * 		=> constructor can not call itself			//=> any method can call itself
	 * 
	 * 		=> constructor can only call ONE constructor
	*/
	
														//=> class has a constructor
	public static void main(String[] args) {			//=> that's way we can creat an object		=> every time you need to create an object, 
														//=>										=> you need to provide the constructor
		
		
//		main(new String[] {"A"});						//=> main method'u iki kez calistirmis olur ama compiler error vermez 
														//=> constructor disinda tum methodlar kendini cagirabilir. bu da cagirir ama calismaz(main method)
		
		
		new example1(9);								//=> this constructor exist in this class.	=> you can not reuse it.
		
//		example2 obj2 = new example2();					//=> reason: #10	=> compailer error.
	
		
	}
	
}
