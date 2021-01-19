package day37_arraylist02;

import java.util.*;

public class X04_ArraysAsList {

	public static void main(String[] args) {
		
															
		List<String> cars = new ArrayList<>();				//=> ArrayList
		cars.add("Honda");									//=> you can add by one by
		cars.add("Suzuki");									//=> etc add more values
		System.out.println(cars);
		System.out.println(cars.toString());
		
		
		// declare and add values in single statement
		// Arrays class
		List<String> cars1 = Arrays.asList("Mazda", "Toyota", "Kia");	// => Array's converting to the List
		System.out.println(cars1);
		System.out.println(cars1.toString());
//		cars1.add("Mercedes");											//=> Array is fixed size. That's why you can not add anything.
//		System.out.println(cars1);										//=> don't give an error --> it doesnt compile --> will not work		
//		System.out.println(cars1.toString());
		
		
		
		// declare and add values in single statement
		// Arrays class
		List<Integer> nums = Arrays.asList(4,2,5,7,8);					//=> asList method
		System.out.println(nums.size());
		System.out.println(nums.toString());
//		nums.add(100);													//=> don't give an error --> it doesnt compile --> will not work
//		System.out.println(nums.toString());							//=> Array is fixed size. That's why you can not add anything.
		
		
		// create arraylist prices
		// assign 10 values using Arrays.aslist method
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 12.0, 9874.44, 34.4, 123.5);
		System.out.println(prices);
		System.out.println(prices.toString());
		
		
		// calculate sum of all prices
		// for each
		double sum = 0;
		for(double price : prices) {
			sum += price;
		}
		System.out.println("Sum: " + sum);
		
		
		// other loop ex.
		double sum2 = 0;
		for(int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("sum2 " + sum2);
		
		
		
		// create new List<Double> expensive
		// add prices that are more than 100 from prices list
		List<Double> expensive = new ArrayList<>();
		
		for(double price : prices) {
			if(price > 100.0) {
				expensive.add(price);
			}
		}
		
		System.out.println("Expensive: " + expensive.toString());
		
		//remove all expensive prices from prices
		//prices.removeAll(expensive);
		//System.out.println("prices: " + prices.toString());		//==> farkli degerler koyarsak bu sekilde yapiliyor.
		
	}
}
