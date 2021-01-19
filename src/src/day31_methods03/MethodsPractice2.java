package day31_methods03;

import java.util.*;

public class MethodsPractice2 {

	public static void main(String[] args) {
		
		// ### Cars ###

		drive("Audi", 75);		//=> string oldugu icin turnak icinde yazdik markayi, digeri int oldugu icin direk yazilir
	  //drive(75, "Red Audi");	//=> code hata verir cunku stringi once koymustuk
		drive("Red Audi", 70);
		
		
		
	}
	
	
	/**
	 method name: drive
	 return type: void
	 params/args: String car, int speed
	 
	 Audi is driving 60 mph 
	 
	 * */
	
	public static void drive(String car, int speed) {
		System.out.println(car + " is driving " +speed+" mph");		
	}
	
	
}
