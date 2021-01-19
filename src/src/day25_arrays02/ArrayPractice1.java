package day25_arrays02;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		// ### Array  Murodil
		
		int [] nums = new int[5];
		
		nums [0] = 123;
		nums [1] = 432;
		nums [2] = 567;
		nums [3] = 765;
		nums [4] = 1;
		
		int [] myNumbers = {3, 9, 7, 64, 6, 11, 26, 27, 1, 15, 99, 1000, 88, 555};
		
		System.out.println(myNumbers[0]);
		System.out.println(myNumbers[1]);
		
		System.out.println(myNumbers.length); // ==> lengh kac tane item var onu yazdiriyor.
		
		
		
		nums [0] = 100;
		nums [1] = nums [1] + 10;
		nums [2]++;
		nums [3] = nums [0];
		nums [4] = nums [0] + nums [1] + nums [2];
		// we can use all these 
		
		
		
	}

}
