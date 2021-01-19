package day52_final_keyword_05;

import java.util.Arrays;

public class X02_FinalArrays {
	
	public static void main(String[] args) {
		
		final int[] TEAMS = {11,11};
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
	//	TEAMS = new int [] {10,10,10}; 							//=> you can not do that - yeni bir object create edemezsin, FINAL sonrasi
		
		
		int[] nums = new int[] {23, 55, 35543};					//=> normal Array
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {23423, 45645, 2, 24, 23, 4665, 1};	//=> buraya yeni bir OBJECT create edebildik, cunku ustteki Array Final degil. 
		System.out.println(Arrays.toString(nums));
	
	
	//  =====================================================================================================================	
		final int[] finalNums = {23, 66, 44, 11};				// value final inside.
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34567;									// you can change here => first element (NOT ALL elements)
		System.out.println(Arrays.toString(finalNums));
			
	//	finalNums = new int[] {22, 44, 56, 1123, 345};			// you cant change it. so you can't create object
	//  =====================================================================================================================	
		
		final double[] PRICES = new double[3];					// VALUES CAN CHANGE (3)
		PRICES[0] = 85.5;										// not items. items is 3.
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;								
		
		System.out.println(Arrays.toString(PRICES));			// element can change
		PRICES[0] = 81.1;										// Burada 0'da iteminda bulunan (85.5) degerini degistirdik.
		System.out.println(Arrays.toString(PRICES));
		 
	//	PRICES = new double[3];									// Bu BRAND new VALUE create etmis oluyor. yeni bir tane VALUE acamayiz item (3) bile olsa.
	//	will not work											// bunlar FINAL keyword icin gecerli
		
	//  usttekinin anlami tam olarak ( I CAN NOT change the OBJECT, I have already OBJECT) - ( I can CHANGE value)	
		
		
		
	}
}
