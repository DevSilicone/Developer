package day27_arrays04;

import java.util.*;

public class ArrayPractice5 {

	public static void main(String[] args) {
		
		// ### Binary Search ### ==> ## must be already sorted ##
		
		
		int[] nums = {4, 6, 7, 10, 55};				//===> this is a sorted 
		
		System.out.println(Arrays.binarySearch(nums, 7));	// 2
		System.out.println(Arrays.binarySearch(nums, 55));	// 4
		System.out.println(Arrays.binarySearch(nums, 2));	// -1 ==> behind it value comes because of we dont have this number.
		
		
		int i = Arrays.binarySearch(nums, 10);
		System.out.println(i);

		System.out.println();
		
//********************************************************************************************************************************		
		
		int[] nums2 = {40, 6, 17, 10, 55};					
		System.out.println(Arrays.binarySearch(nums2, 40)); // ==> sorted olmadigi icin print yapiyor ama negatif sonuc veriyor. 
															//eger listede olsa kacinci sirada oldugunun bir fazlasini veriyor geriye dogru saydigi icin
															// if its not sorted not a guarantee ( -5 ) wrong.
	
		
		Arrays.sort(nums2);									// sorted ==> yapildiktan sonra kesinlikle dogru sonucu veriyor ( 3 )
		System.out.println(Arrays.binarySearch(nums2, 40));
		
		
		
		
		
		
	}

}
