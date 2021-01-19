package day22_string_loops_rewiew;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * valid moths:
		 * 1,2,3,4,5,6,7,8,9,10,11,12
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		int month;								// ==> DECLARETION ( do ile islem yaptiginda, disariya degeri declare etmek zorundasin.
		
		do{
			System.out.println("Enter month");
			month = scan.nextInt();
		}while(month >= 1 && month <= 12 );
		
		
		System.out.println("invalid month - " + month);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
