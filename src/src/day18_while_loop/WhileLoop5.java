package day18_while_loop;

public class WhileLoop5 {

	public static void main(String[] args) throws InterruptedException { // bu kod Thread.sleep sonrasi kendisi ekliyor program
		
		// 1,2,3,4,5,6,7,8,9,10
		
		int num = 1;
		
		while (num <= 10) {
			System.out.print(num + ", "); // print dedigimiz icin pes pese yazdiriyor
			num++;
			Thread.sleep(1000); // pause the code execution for a second
		}
		
		System.out.println("\nNum value after loop: " + num); // \n alt line aliyor
		
		
		
		//11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
		int num2 = 11;
		
		while(num2 >= 1) {
			System.out.print(num2 + ", ");
			num2--;
			Thread.sleep(500);
		}

		System.out.println("\nNum2 value after loop: "+ num2);
		
		
	}

}
