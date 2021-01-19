package day57_interfaces3;

import java.util.Scanner;
import java.util.function.Predicate;

class scratch {
	
	public static void main(String[] args) {
	
		// Built-in Functional Interfaces --> 
		// Predicate
		// Supplier
		// Consumer
		// Function
	
	}
}

/*
interface Predicate<T>{
	boolean test(T t); // Functional method --> provide implementation
	give it a parameter -> let it return boolean expression
}
*/

class Test {
	
	public static void main(String[] args) {
		AhmetsInterface<Integer, Integer> ahmetsInterface = (x,z) -> System.out.println(z+x);
		// Predicate<Integer> predicate1 = new Predicate<Integer>();
		
		Predicate<Integer> predicate1 = x -> ( x + 5 ) > 0; // T/F
		System.out.println(predicate1.test(5)); // T
		
		Predicate<String> stringPredicate = x -> x.contains("a");
		// x.startsWith("H");
		
		result(stringPredicate, "8");
		result(x -> x.contains("a"), "u"); // Functional programming
		result(x -> x.startsWith("i"), "y");
		
		resultGeneric(integerParam -> integerParam == 0, 8);
		resultGeneric(stringParam  -> stringParam.startsWith("u"), "p");
		resultGeneric(stringPredicate, "a");
		
		
		Scanner scan =new Scanner(System.in);
		
		if (resultGeneric(predicate1, scan.nextInt())) {
			System.out.println("You can enter the website");
		resultGeneric(x -> ( x + 5 ) > 0, 8);
		}
	
		
	}
	
	
	static void result(Predicate<String> stringPredicate, String string) {
		if (stringPredicate.test(string))
			System.out.printf("The Predicate is true for %s ", string); // %d
		else
			System.out.println("The Predicate is false " + string);
	}
	
	
	static <T> boolean resultGeneric(Predicate<T> predicate, T t) {
		if (predicate.test(t))
			System.out.printf("The Predicate is true for %s ", t); // %d
		else
			System.out.println("The Predicate is false " + t);
		return predicate.test(t);
	}
}


@FunctionalInterface
interface AhmetsInterface <A,B> {
	void test(A t, B message);
}