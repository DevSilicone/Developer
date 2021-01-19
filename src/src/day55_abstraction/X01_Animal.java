package day55_abstraction;

public abstract class X01_Animal {

	private String name;
	
	public X01_Animal (String name) {
		this.name = name;
	}
	
	
	/*
	 * Abstac class 	
	 *					=> Concrete class (rugular non-abstract class).
	 * 					=> a concrete class is the one from which you can create an instance (object).
	 * 
	 * 				=> we use keyword abstract to make class abstract
	 * 				=> an then, we can have absract methods inside.
	 * 
	 * 				=> why do we need it?		=> 
	 * 
	 * 				=> non-abstract class can extend abstract class
	 * 
	 * 				=> abstract class can extend other abstract class
	 * 
	 * 				=> if abstract class, extends other abstract class, child class is not responsible for implementation abstract methdos. 
	 * 				=> But, concrete class must implement all abstract methods.
	 * 
	 * 				=> you canNOT make abstract method final.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public abstract void speak(); 	// so we canNOT abstract methods in regular classes
	
	public abstract void eat();
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;  
	}


	public void produceAMilk() {
		
	}
	
}
