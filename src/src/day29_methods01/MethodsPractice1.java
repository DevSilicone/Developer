package day29_methods01;

public class MethodsPractice1 {

	public static void main(String[] args) {
		
		// ### Student ###
		
		study();
		code();
		
		
	}
	
	// buraya yeni bir method aciyoruz. ileride ne kullanmak istiyorsak
	
	public static void study() {
		System.out.println("Student is studying");
	}
	
	// create a method with name sayHello. that prints "Hello Friends!"
	
	public static void sayHello() {
	System.out.println("Hello Friends!");
	System.out.println("How are you today?");
	}
	
	// create a method with name code.
	// "Inside code method"
	// "Student is coding Java"
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
}
