package day54_inheritance_review_07;

class superclass{
	
	public void original() {
		System.out.println("cyber");
	}
	
	public static void method() {
		
	}
	
	public static void method(int a) {
		
	}
	
	protected void method1() {
		
	}
	
}

public class X13_Method_Overriding extends superclass {
	
	/*
	 * Method Overriding
	 * 					=> only instance methode (that doesn't mean every method override)
	 * 					=> method needs to be override in SUBCLASS
	 * 					=> paramter MUST be same
	 * 					=> @Override should be applicable
	 * 
	 * 
	 * 					=> you can overload MAIN method, bu tit's not going to be main method
	 * 
	 * Method override vs method overload:
	 * 
	 * 			Method_override => MUST have same signature					
	 * 							=> canNOT be override in same class
	 * 							=> return type needs to be SAME
	 * 							=> access modifier needs to be same or more visible
	 * 							=> only instance methods (does not have final and private) can be override
	 * 							
	 * 			Method overload	=> MUST have different parameter
	 * 							=> can be overload in same class
	 * 							=> return type can be same or diffirent
	 * 							=> access modifier can be different
	 * 							=> any methods and constructor can be overload
	 * 
	 * 
	 * */
	
//	void method1() {			=> access modifier needs to be same or more visible
		
//	}
	
	public void method1() {
		
	}
	
	@Override				//=> checks if the method is being override
	public final void original() {
		System.out.println("Batch 11");
		
	}
	
	public static void main(String[] args) {
		new X13_Method_Overriding().original();
		new superclass().original();
		
		
	}

}
