package day64_collections01;
import java.util.*;
public class X04_StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> numsStack = new Stack<>();
		
		numsStack.add(50);
		numsStack.push(60);
		numsStack.push(70);
		
		System.out.println(numsStack.toString());
		
		System.out.println(numsStack.peek());		// check value on top of stack
		
		System.out.println(numsStack.pop()); 		// read values on top of stack then remove it
		
		
		System.out.println(numsStack.peek());		// pop'dan sonra cikardigimiz degeri kontrol ettik
		
		System.out.println(numsStack.toString());	// burada pop ile cikardiktan sonra kalani print ettik
		
		System.out.println(numsStack.get(0)); 		
		
		
		
		
	}

}
