package day64_collections01;
import java.util.*;
public class X02_LinkedListExample {

	public static void main(String[] args) {
	
		List<Integer> list = new LinkedList<>();				//=> polymrphic way			//=> a lot of time you will see this way
		
		LinkedList<Integer> list2 = new LinkedList<>();			//=> LinkedList 			// first ve last eklediginde-bastakini aliyor son ekledigin yapiyor.
		
		
		list.add(50);
		list.add(500);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.contains(50));
		
		list2.add(30);
		list2.add(40);
		list2.add(60);
		list2.add(60);
		
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
		
		System.out.println(list2.toString());
		list2.addFirst(1);
		list2.addLast(9999);
		System.out.println(list2.toString());
		
		
		
		
		
	}
	
}
