package day24_arrays01;

public class Arrays9 {

	public static void main(String[] args) {
		// write a program that will print true
		// if first and last number is the same
		// if first and last value in the array of list
		// is same, print true
		
		int[] numbers = {12, 41, 213, 21, 42, 12};
		
		boolean equals = numbers[0] == numbers[numbers.length-1]; // .length => is not a method, it's a instance variable (property)
		System.out.println(equals);
		
		
		// diger baska yontem
		System.out.println(numbers[0] == numbers[numbers.length-1]);
		

		// if ile yazdirma 
		
		if(numbers[0] == numbers[numbers.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
		
		
		
	}

}
