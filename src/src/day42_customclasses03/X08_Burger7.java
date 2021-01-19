 package day42_customclasses03;

import java.util.*;
 
public class X08_Burger7 {

	public static void main(String[] args) {
		
		X07_Burger burger1 = new X07_Burger();
		burger1.name = "COWBOY";
		
		String[] ings = {"onion crisps", "american cheese", "pickles", "lettuce", "b7 saouce"};
		burger1.ingredients = ings;  				// this is array how can we create it
		
		
		//everything in one line
		System.out.println(burger1.name);
		
		//System.out.println(burger1.ingredients); // this is array ve hata verir calistirinca
		System.out.println(Arrays.toString(burger1.ingredients)); // bu sekilde yapinca print eder.
		
		// print first ingredient
		System.out.println(burger1.ingredients[0]); // bunu yaparsak istedigimizi print ederiz
		
		
		
		// print all ingrediens using a loop
		for(String ing : burger1.ingredients) {
			System.out.println(ing);
		}
		
		 
		
		
		
	}

}
