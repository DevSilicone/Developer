package day37_arraylist02;

import java.util.*;

public class X01_Shopping {

	public static void main(String[] args) {
	
		// ArrayList shopping

		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("Clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");  //=> kurek
		
		//print number of items
		
		int count = shoppingList.size();
		System.out.println();
		System.out.println("Total count: " + count);
		
		//print all items in single line
		System.out.println(shoppingList.toString());
		
		// print first and last item in single line
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count-1)); // out of bound expection olmasin diye -1 yapiyoruz
		
		// remove somethings
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList);
		System.out.println(shoppingList.get(0)); 	//=> bi ustte paper towel cikardigimiz icin, simdi dish soap oldu 0
			
		shoppingList.remove(0);						// => burada yine en alisveris listesinin en basindakini listeden cikarmis olduk.
		System.out.println(shoppingList.toString());
		
		
		for(String item : shoppingList) {
			System.out.println(item);
			
		}
		
		//remove all items at once
		shoppingList.clear();						// her seyi alisveris sepetinden cikardik
		System.out.println(shoppingList.toString());
		
		
	}
	
}
