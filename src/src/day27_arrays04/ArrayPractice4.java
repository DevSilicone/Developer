package day27_arrays04;

import java.util.*;

public class ArrayPractice4 {

	public static void main(String[] args) {
		
		// ## toString method (class) ## //
		
		int[] nums = {43, 12, 4, 1, 3, 5};
		
		System.out.println(Arrays.toString(nums));			// ==> toString (Array olarak yazdigimiz value, string olarak print ediyoruz)
		
		String str = Arrays.toString( nums );				
		
		System.out.println(str);							// ==> 
		
		System.out.println();
//**************************************************************************************************************	
		
		// ## sort method ##
		
		Arrays.sort(nums);						// ==> numaralari kucukten buyuge siraya dizdi veya harfleri. siralamayi yapiyor.
		
		System.out.println(Arrays.toString(nums));
		
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish"};
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		System.out.println();
//**************************************************************************************************************		
		
		int[] nums2 = {345, 665, 3333, 11, 3, 66};
		
		System.out.println(Arrays.toString(nums2));
		
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[nums2.length -1];
		
		System.out.println("Lowest num: " + lowest);
		System.out.println("Largest num: " + largest);
		
		System.out.println(Arrays.toString(nums2));
		
		System.out.println();
//**************************************************************************************************************		
	}

}