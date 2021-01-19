package day27_arrays04;

import java.util.*;

public class ArrayPractice6 {

	public static void main(String[] args) {
		
		// ### Arrays Equals ###

		int[] nums1 = {4, 5, 6, 10, 100};
		int[] nums2 = {4, 5, 6, 10, 100};
		
		System.out.println(Arrays.equals(nums1, nums2));
			
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatched values present");
		}
	
		
		System.out.println();
//********************************************************************************************************			
	
	
		String[] strArr1 = {"one", "two", "three"};
		String[] strArr2 = {"one", "two", "three"};
		
		System.out.println(Arrays.equals(strArr1, strArr2));
		
		boolean match = Arrays.equals(strArr1, strArr2);
		
		System.out.println("match: " + match);
		// below will not work, you can only compare same data type
		// Arrays.equals(strArr1, nums2);							==> ayni olmak zorunda type lar.
		
		
		
		
		
		
	}
}