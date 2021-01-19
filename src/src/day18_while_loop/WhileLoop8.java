package day18_while_loop;

public class WhileLoop8 {

	public static void main(String[] args) {
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 */

		String stairs = "*";
		System.out.println(stairs);
		
		stairs = stairs + "*";
		System.out.println(stairs);
		
		
		stairs += "*";
		System.out.println(stairs);
		stairs += "*";
		System.out.println(stairs);stairs += "*";
		System.out.println(stairs);stairs += "*";
		System.out.println(stairs);stairs += "*";
		
		
		//=====================
		System.out.println();
		//=====================
		
		String stairs1 = "*";
		//1) with loop counter
		int num = 1 ;			// 10 tane oldugunu dusunerek..
		
		while(num <= 10) {
			System.out.println(stairs1);
			stairs1 += "*";
			num++;
		}
		//2) checking length()
		
		stairs1 = "*";
		
		while(stairs1.length() <= 10) {
			System.out.println(stairs1);
			stairs1 += "*";			
		}
		
		
		
		
		
	}

}
