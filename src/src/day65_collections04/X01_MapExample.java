package day65_collections04;
import java.util.*;
public class X01_MapExample {
	public static void main(String[] args) {
		
															// string -> key must be always String type and unique
															// Double doesn't have to unique (it can be custom class instead of Double)
		Map<String, Double> items = new HashMap<>();		// Double buyuk harfle yaziyoruz. cunku collectionlar hala primitivlere erisemiyor. Wrapper olabilir.
		
		items.put("Apples", 3.49);
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Cherries", 4.34);
		items.put("Milk", 6.0);
//		items.put("Milk", 5.0);								//=> keys are unique -> bu yuzden duplicate yapmiyor -> 6 yerine 5 print ediyor.
		
		
		System.out.println(items.size());
		
//		---------------------------------------------		
		System.out.println(items.get("Flowers"));			// case sensetive -> harf yanlis girersen null print eder. 
		System.out.println(items.get("Apples"));
		System.out.println(items.get("Eggs"));
		System.out.println(items.get("Cherries"));
		System.out.println(items.get("Milk"));
		
		System.out.println(items.toString()); 				// key and value together.
		
//		----------------------------------------------		
		System.out.println(items.isEmpty());
//		---------------------------------------------		
		items.remove("Flowers");
		
		System.out.println(items.toString());
//		---------------------------------------------
		
		System.out.println("Is Apples there? " + items.containsKey("Apples"));
		System.out.println("Is Flowers there? " + items.containsKey("Flowers"));		// bir ustte flowers cikardik o yuzden false cikiyor.
//		------------------------------------------------------------------------
		
		items.replace("Eggs", 2.99);
		System.out.println("Price of Eggs: " + items.get("Eggs"));						// rakamlari update ediyoruz.
		
		items.replace("Milk", 8.20);
		System.out.println("Price of Milk: " + items.get("Milk"));						// rakamlari degistiriyoruz.
		
		
		// increase price of cherries by $2
		//						once oku - sonra ekle					=> 2 eklemis olduk..
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println("Price of Cherries: " + items.get("Cherries"));
		
		
		
	}
}
