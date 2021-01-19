package day35_methods07_practice;

import java.util.*;

public class Practice1 {

	static public void main(String... strings) {
		
		/** 			### Unique Array ###							==> bir degerin icerisinde cift olmayanlar, tek olanlar.
		 ### interview bu konuda soru soranlar oluyor ####
		
				int[] array and we need to print unique numbers
				
		1) in main method												==> interview icin bununla cevap yeterli
		2) void method that accepts an array
		3)method that accepts int[] and returns int[] with unique values
		**/
				
	//*************************************************************************************************************************	
		
		/* 
		declare  array nums and assign values
		{7, 4, 1, 4, 1, , 9, 9, 3}
		code to find unique values:
		nested loop
		if condition
		counter
		 */	
		
		int[] nums = {10,4,4};				
		System.out.println(Arrays.toString(nums));
		
//		System.out.println();
		
		findUnique(nums);
		
		System.out.println();
		
		int[] arr = {2,3,4,5,6,7,2,3,4,5};
		findUnique(arr);
		
		System.out.println();
		
		int[] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
		
		System.out.println();
		
		int[] cheapUnique = getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));
	}
	

	public static void findUnique(int[] nums) {
		
		for(int i=0; i < nums.length; i++) {			//=> outer loop
			
			int temp = nums[i];							//=> get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {		//=> inner/nested loop
				if(nums[j]  == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {							//=> is it still 0. then it is unique => thats the purpose
				System.out.print(temp);
			}
		}
				
	}

	// declare empty string
	//find unique numbers and add to that string
	//split that string by space
	//declare new int[] and assign each number from split
	//return the int[] array
	
	public static int[] getUniqueArrayCheapV2(int[] nums) {
		
		// declare empty string
		String unique = ""; // 0 6 7 1
		
		
		for(int i=0; i < nums.length; i++) {			//=> outer loop
			
			int temp = nums[i];							//=> get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {		//=> inner/nested loop
				if(nums[j]  == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {							//=> is it still 0. then it is unique => thats the purpose
				//find unique numbers and add to that string
				unique += temp+" ";
			}
		}
		
		//split that string by space
		String[] strArr = unique.trim().split(" ");
		
		//declare new int[] and assign each number from split
		int[] uniqueArr = new int[strArr.length];
		for(int k = 0; k < strArr.length; k++) {
			uniqueArr[k] = Integer.parseInt(strArr[k]);
		}
		
		//return the int[] array
		return uniqueArr;
		
	}

	
	// find out how many unique numbers
	// declare new array with that size
	// and loop through again and assign unique numbers 
	// return the array 
	
	public static int[] getUniqueArray(int[] nums) {
		
		// find out how many unique numbers
		int uniqueCount = 0;
		
		for(int i=0; i < nums.length; i++) {			//=> outer loop
			
			int temp = nums[i];							//=> get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {		//=> inner/nested loop
				if(nums[j]  == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {							//=> is it still 0. then it is unique => thats the purpose
				uniqueCount++;
			}
		}
		
		//declare new array with that size
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;
		
		// and loop through again and assign unique numbers 
		for(int i=0; i < nums.length; i++) {			//=> outer loop
			
			int temp = nums[i];							//=> get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {		//=> inner/nested loop
				if(nums[j]  == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {							//=> is it still 0. then it is unique => thats the purpose
				uniqueArray[idx] = temp;
				idx++;
			}
		}
		return uniqueArray;  //=> daha sonra tekrar bakilacak hatali. bu kisim yok
			
	
		
		
	}	
}		
	

	
		

		

