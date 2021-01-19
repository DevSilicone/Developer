package day27_arrays04;

import java.util.*;

public class ArrayPractice8 {

	public static void main(String[] args) {
		
		// ### Copy Of 2 ####

		
		
		// copy all the values from array and also add 2 more spaces
		int[] nums1 = {34, 56, 23, 1, 55};
		int[] nums2 = Arrays.copyOf(nums1, nums1.length + 2); // => +2 koyunca extra iki yeni deger ekleyebiliyoruz veya ne kadar istersek ekleriz. 
		
		
		System.out.println(Arrays.toString(nums2));
		
		
		// assign new value like these
		nums2[5] = 100;
		nums2[6] = 200;
		System.out.println(Arrays.toString(nums2));

		System.out.println("***************************");
//*******************************************************************************************************************************
		
		// Copy of Range 
		int[] nums3 = {34, 56, 23, 1, 55};
		int[] nums4 = Arrays.copyOf(nums3, nums3.length + 2);
		int[] nums5 = Arrays.copyOfRange(nums3,  1,  3);
		System.out.println("Nums: " + Arrays.toString(nums5));
	
	
	
	
	
	}

}
