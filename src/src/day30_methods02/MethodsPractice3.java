package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MethodsPractice3 {

	public static void main(String[] args) {
		
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		
		rangePrint();
		rangePrint();
		
		
//		while(true) {							==> loop yapar
//			showMe5Numbers();
//		}
	}
	
		public static void showMe5Numbers() {
			Random r = new Random();
			for(int i = 1; i <= 8; i++) {
				System.out.print(r.nextInt(1001) + " "); // print random num 0-1000
			}
			System.out.println(); // take it to new line
		}
		
		
		public static void rangePrint() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 2 nums: ");
			
			int num1 = scan.nextInt();	// 2
			int num2 = scan.nextInt();	// 5
			
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.println(i + " ");
				}	
			}else if(num1 > num2) {
				for(int k = num1; k >= num2; k--) {
					System.out.println(k + " ");
				}
			}else {
				System.out.println(num1);
			}
			
			System.out.println();
		}
		
	
}

