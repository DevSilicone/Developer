package day34_methods06_varargs;

import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
	
		// ### Main Array ### => bir onceki practice yazdiklarimizi buraya alma
		
		// 1-) getArray
		System.out.println(Arrays.toString(Practice1.getArray()));
//		System.out.println(Practice1.getArray());					=> Hashcode
		
		System.out.println("******************************************************************************");
		
		// 2-) getArray
		//store return value into array
		int[] nums = Practice1.getArray();
		System.out.println(Arrays.toString(nums));
		
		System.out.println("******************************************************************************");
		
		// 3-) getRandomArray
		/*
		 Geturn type: int[]
		 Params: int size
		 in the method create an array with value of size.
		 and assign random values from 0 -100 and return it
		 * */ 
		
		System.out.println("******************************************************************************");
		
		// for(;;) { // while(true) ==> both are infinite loop
		System.out.println(Arrays.toString(Practice1.getRandomArray(20)));
		//}
		int[] randomNums = Practice1.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}	
}
