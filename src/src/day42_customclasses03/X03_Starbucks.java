package day42_customclasses03;

public class X03_Starbucks {

	public static void main(String[] args) {
		
		// declare an array that can store 2 Coffee objects
		// int[] nums = new int[2];
		// String[] str = new String[3];
		// str[0] = "java";
		
		// declare coffeeArray that can store 2 coffee object
		X01_Coffee[] coffeeArray = new X01_Coffee[2];				// array in our class // coffee array can hold [2]
		
		// create coffee object and assign to index
		coffeeArray[0] = new X01_Coffee();						// we are declearing new coffe index
		
		// access coffee object in index 0 and set data
		coffeeArray[0].setCoffeInfo("EXPRESSO", "TALL" , 2.55, 7);
		
		// access coffee object in index 0 and call method getCoffeeInfo
		coffeeArray[0].getCoffeeInfo();
		
		
		
		
		// create a single object first
		X01_Coffee latte = new X01_Coffee();							// ust taraftaki gibi de olur, burasi gibi de. burasi daha cleare
		
		// assign data
		latte.setCoffeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		
		// assign the latte object to index 1 of the array
		coffeeArray[1] = latte;									// bu ve yukaridaki coffeeArray[0] atadigimiz isim
		
		// print data fro objec in index 1.
		coffeeArray[1].getCoffeeInfo();
			
	}

}
