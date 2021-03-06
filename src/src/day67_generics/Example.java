package day67_generics;

import java.awt.print.Printable;

//Generics
public class Example {

	// Generic Method : Methods that can accept different kind of parameters
	
	
	static <E> void print(E element){
		System.out.println(element.getClass().getName() + " = " + element );
	}
	
	
	public static void main(String[] args) {
		
		print(1100);
		
		print("String");
	}

}
