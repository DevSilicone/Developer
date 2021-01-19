package day25_arrays02;

public class ArrayPractice4 {

	public static void main(String[] args) {
		
		// Shopping
		
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas Socks"};
		
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		
		int[] itemsId = {12345, 12346, 12347, 12348, 12349,};
		
		
		// print count of products
		System.out.println("Product count: " + products.length); // ==> product adedi
		
		System.out.println();
//****************************************************************************************************************************
		
		// check if products, prices and items IDs have same count
		if( products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
			return;
		}
		
		
		// loop though products and print each one in seperate line
		// {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas Socks"};
		for(String p : products ) { // ==> sag taraf collection put ARRAY - sol tarafa sol tarafata declare etmek istedigimiz veriable 
									// ==> parantezin icine de variable turu ne ise onu koyuyoruz STring veya int gibi
									// ==> p temprorary veriable biz atiyoruz, ne istersek	
				System.out.println(p);
		}							// for (loop) her seferinde bir sonraki urunu print yapiyor, donuyor sirayla ve print ediyor.
		
		System.out.println();
//******************************************************************************************************************************			
			
		// prices --> for loop
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
			
	
		// itemsId ---> print this in reverse order using loop (tersten fiyatlari yazdir
		
		System.out.println(itemsId[itemsId.length-1]); //==> -1 bize en son degeri veriyor
		
		for(int Id = itemsId.length -1 ; Id >= 0; Id--) { //==> minus -- koymamizin sebebi geriye dogru saydiriyoruz.
			System.out.println(itemsId[Id]);
		}
		
		System.out.println();
//******************************************************************************************************************************		
		System.out.println("#### YOUR SHOPPING RECEIPT ####");
		
		// print a report. with a total price
		// item 1: 12345 - Timberland Shoes - $120.0
		// .....
		// Total price:
		
		double totalPrice = 0.0;
		for (int i = 0; i < products.length; i++) {
			System.out.println("Item " + (i+1) + ":" + itemsId[i] + " - " + products[i] + " - $" + prices[i]);
			totalPrice += prices[i];
		}
		
		System.out.println("Total Price: $" + totalPrice);
		
		System.out.println();
//********************************************************************************************************************************		
		
		// find most expensive item in your and print it as a report
		// loop and find. Do not use Arrays class
		// {120.0, 5.99, 150.50, 3000.5, 6.99}
		
		int maxIndex = 0;
		double maxPrice = 0;
		
		for ( int j = 0; j < prices.length; j++ ) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
				
			}
		}
		
		System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);
		
		
		
		
		
		
	}

}
 