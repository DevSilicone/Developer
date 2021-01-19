package day24_arrays01;

import java.util.Arrays;

public class Arrayss10 {

	public static void main(String[] args) {
		
		// ### CAR SHOP ###

		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// 1) create an array of strings and store these cars inside that array.
		// 2) print car names that starts wit M
		// if
		// print all cars that have letter "r" somewhere in the name
		// please make your search case insensitive
		// print car names that ends with "a"
		// print all cars that have at least 6 letters
		// Swap first and last value in the array
		// create a temp variable, that will get a value of first
		
		
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		// araclarin hepsini print etmek icin
		
		/*	int i = 0;
		
			while(i++ < cars.length-1) {
				System.out.println(cars[i]);
		 ***** i ++    => increment buraya da konubilir ve daha iyi.
			}
		
		*/
		
		
		for (String c: cars) {
			if(!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		
		System.out.println("**************");
		
		for(String make : cars) {
			if(make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}

		System.out.println("**************");
		
		for(String cars1: cars) {
			if(!cars1.endsWith("a")) {
				continue;
			}
			System.out.println(cars1);
		}
		
		
		System.out.println("**************");
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].length() >= 6) {
				System.out.println(cars[i]);
			}
		}
	
		System.out.println("**************");
		// create a temp variable, that will get a value of first element
		String temp = cars[0];
		// we swap values of first and last element
		cars[0] = cars[cars.length-1];
		// since temp variable has value of first element of array,
		// we assign this value to the last element i the array
		cars[cars.length-1] = temp;
		
		System.out.println(Arrays.toString(cars));
	
		System.out.println("**************");
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(cars));
		
		Arrays.sort(cars);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(cars));
	
		System.out.println("Position: " + Arrays.binarySearch(cars, "Ford")); //=> pozsiyon numarasi bulma (binarysSearch). 
		
		
		
		
		
	}

}
