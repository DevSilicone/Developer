package day54_inheritance_review_07;

class Animals{
	
	public Animals() {
		System.out.println("Tiger");
	}
}




public class X08_Constructor_super1 extends Animals   {		//=> extends Animals eklemezsek, no-arg constructor olur ve asagiya bir sey print etmez. 
												
	public X08_Constructor_super1() {						//=> 
	//	super()												//=> super ()	=>	default constructor from parent class
	}
	
	public X08_Constructor_super1(int a) {					//=> it still gives "Tiger", bacause
	// super()													//=> super class default constructor called in every single constructor in sub class
		
	}
	
	public X08_Constructor_super1(double a) {
	//	super()											//=> butun classlarin hepsi default olarak super almis olur, default constructor oldugu icin.	
	}													//=> super class const. must be call in sub. class.
	
	
	
	public static void main(String[] args) {
		new X08_Constructor_super1();						//=> print tiger. because, super class default constructor is called in subclass by the compiler.
		
	}
	
}	

	

