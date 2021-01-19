package day34_methods06_varargs;

import java.util.Arrays;

import day07_scanner_operators.AddNumbers;

public class Practice3 {

	public static void main(String[] args) {
		
		// #### Var ARGS ####
		
		printWords("red", "blue", "yellow"); // 3values
		printWords("grey");					 // one value
		printWords();						 // empty. so array will be empty array.
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(myPets);
		
		System.out.println("*************************************************************************************");
		
		System.out.println(sum(3, 5, 10));	 // 18
		System.out.println(sum(87564, 545, 879844, 535324324));
		
		int budget = 100;
		if(sum(10, 45,10, 30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 43, 567, 12, 34, 5);
		System.out.println("total: " + total);
		
		System.out.println("*************************************************************************************");
		
		cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa", "Hot sauce");
		cook("Avocado Toast", "Avocado", "Sunny Side eggs", "Wheat breat");
		
		
		System.out.println("*************************************************************************************");
		
		shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");
		
		
		
	}

	public static void printWords(String... words) {  // this can only be USED IN METHOD PARAMETER. nowhere else
		
		//handle it like on ARRAY
		
		for(String w : words) {
			System.out.println(w);
		}
		
	}
	
	/**
	 * sum(10,30,40); ==> 80
	 * sum(30,40);	  ==> 70
	 * */
	
	public static int sum(int... nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n; 		//sum - sum +n
		}
		return sum;
	}
	
	public static void cook(String name, String... ings) {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}
	//shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");
	public static void shoppingList (int totalPrice, String... items) {
		System.out.println("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	
	}
	
	

}	
	
	

