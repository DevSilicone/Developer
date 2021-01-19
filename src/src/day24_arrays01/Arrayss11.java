package day24_arrays01;

import java.util.Arrays;

public class Arrayss11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		
		System.out.println(Arrays.toString(lotteryNumbers));
		
		// Arrays.sort(lotteryNumbers);
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		
		// binary search works only with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 45);
		System.out.println("Position: " + index);
		
		// if value doesn't exist ==> value is mines -2 because of binary search
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position: " + index2);
		
		
		
		
	}

}
