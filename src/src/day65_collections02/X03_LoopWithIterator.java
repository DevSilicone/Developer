package day65_collections02;
import java.util.*;
public class X03_LoopWithIterator {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);nums.add(543);nums.add(1150);nums.add(550);nums.add(570);
		nums.add(90);nums.add(5330);nums.add(1150);nums.add(50666);nums.add(950);

//		1) Create Iterator Object 
		Iterator<Integer> it = nums.iterator();
		
//		2) Call hasNext, next methods
																// => it's return Boolean ->false (when it reachs the end or empty)
		System.out.println(it.hasNext()); 						// => it's return Boolean ->true  (if there is next value)
		System.out.println("it.hasNext()-> " + it.hasNext());
		System.out.println("it.next()->" + it.next()); 			// => it's pointing ti the firts value, then next value
																// => next() method returns the curent value and moves to next value.
	
//		3) use a while loop
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
	
//		System.out.println(it.next()); 							// => java.util.NoSuchElementException -> hatasi verir. 
																// =? next next yaptigi icin sona gelmis olur. sonda da boyl bir element olmadigi icin.	
//		==============================================================================================================================================
	
		
		Iterator<Integer> it2 = nums.iterator();
		/*
		 * When using Iterator to loop a collection,
		 * we can remove objects while looping.
		 * */
		
		while(it2.hasNext()) {
			int val = it2.next();
			if(val > 1000) {									//=> remove => 1000'in uzerindeki sayilari cikardik bunu kullanarak.
				it2.remove();
			}
		}
		System.out.println(nums.toString());
		
		
//		----------------------------------------------------
//		for(int num : nums) {									//=> java.util.ConcurrentModificationException (hatasi verir) 
//			if(num>400) {
//				nums.remove(new Integer(num));					 => when removing value using for each loop.
//			}
//		}
			
		
		
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Vienna");
		cities.add("Sterling");
		
//		for(String city : cities) {								//=> java.util.ConcurrentModificationException (hatasi verir) 
//			if(city.equals("Boston")) {
//				cities.remove(city);
//			}
//		}
//		
		
	}

}
