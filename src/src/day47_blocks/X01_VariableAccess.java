package day47_blocks;

public class X01_VariableAccess {

	// instance variable
	int myInstanceVar = 40;
	
	
	// static variable
	static int myStaticVariable = 55;
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(myInstanceVar); 	// cannot access non-static from static method
		System.out.println(myStaticVariable);
		
		//create object of VariableAccess and print myInstanceVar (ilk basta olan non-static kullanabilecegimiz hale getirmek)
		X01_VariableAccess v = new X01_VariableAccess();
		
		System.out.println((v.myInstanceVar));		// bunu yaparacak -NON STATIC olani kullandik
		
		//access static variable using objet
		System.out.println(v.myStaticVariable);
		
		//access static vaariable using classname
		System.out.println(X01_VariableAccess.myStaticVariable);
		
		  
	}
}
