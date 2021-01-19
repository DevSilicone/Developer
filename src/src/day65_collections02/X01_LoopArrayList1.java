package day65_collections02;
import java.util.*;
public class X01_LoopArrayList1 {

	public static void main(String[] args) {
			
		List<Integer> nums = new ArrayList<>();
		nums.add(50);nums.add(543);nums.add(1150);nums.add(550);nums.add(570);
		nums.add(90);nums.add(5330);nums.add(1150);nums.add(50666);nums.add(950);
	
		// Loop using FOR EACH LOOP
		for (int n : nums) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		
		// Loop Using For Loop
		for(int i = 0; i <nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");
		}
		System.out.println();
		
		
		// foreach method of Java8
		// forEach method comes from iterable interface
		/*
		 * and we need to pass a lambda expression.
		 * Lambda expression is part of java functional programming
		 * that started from java 8.
		 * it is used to pass an implementation while programmming 
		 * we need to use --> operator.
		 * 
		 * */		
//				kodu birazcik daha az yazmak icin kullaniyoruz ama bu demek degil ki for each loop'dan hizli(yani hizli degil)		
//				Ruby'de cok kullaniliyor.
			
//							lambda expression								
		nums.forEach( n -> System.out.print( n + " | "));		//=> n-> just variable name - you can put whatever you want. (sonrasinda ne istoyrsan onu ekleyeceksin)
																//=> bu ornekte n integar. o yuzden value eklemek gerekiyor.
		System.out.println();
		
		
		nums.removeIf(n -> n < 500);							// lambda ile birlikte calisiyor - 500'den kucuk degerleri aldik mesela.
		nums.forEach(n -> System.out.print(n + " | "));
		
//		nums.stream()											// can also be used to manipulate data in the collections.
	
		
		
		/*
		 * All actions that java fubctional programming can also be achieved using 
		 * traditional dor each/loops.
		 * functional programming is only for shorter code and faser programming
		 * in general in java fubctional programming is slower than tradational loops
		 *
		 */
		
		
		

	}

}
