package day24_arrays01;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		
		// let's create an array of integers length 3
		int[] numbers = new int[3];
		
		//firs value in array
		numbers[0] = 25;
		//second value in array
		numbers[1] = 10;
		//third calue in array
		numbers[2] = 20;
		
		// [I@15db9742 this is a ## HASH ## code (sadece nuber girince print olan.
		System.out.println(numbers);
		
		// toString() ==> from arrays class can help as to print an arrays as string
		System.out.println(Arrays.toString(numbers));
		
		
		int sum = 0;
		// please use for loop, in order to loop through the array
		// and calculate sum of all elements
		// nubers.length ==> returns number of elements in the array
		// the final field array. length can not be assigned.
		// numbers.length = 5;
		for (int i = 0; i < numbers.length; i++) {  // this condition is false because it print like 
			sum = sum + numbers [i];
		}
		
		System.out.println("Sum: "+sum);
		
		// find lagest value in the array
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("Max value: "+max);
		
		//###### FIND MIN VALUE IN THE ARRAY ####
		
		int min = Integer.MAX_VALUE;
		
		for(int k = 0; k < numbers.length; k++) {
			if(numbers[k] < min) {
				min = numbers[k];
			}
		}
		
		System.out.println("Min value: " + min);
		
	}

}
