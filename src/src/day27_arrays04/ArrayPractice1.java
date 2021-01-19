package day27_arrays04;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		/* Times Array */
		
		// declare 2 int arrays that can hold hour and minute
		// Both of them have 2 items/values that represent hour and minute
		// hours : 0 -23
		// minutes : 0 - 59
		
//******************************************************************************************
		
		int[] time1 = new int [2];  // 0,0 by default
		int[] time2 = new int [2];  // 0,0 by default
		
		/*int[] time1 = {20, 45}
		  int[] time2 = {15, 33} ==> iki yol ile de declare edilebilir.*/ 
		
		
		// System.out.println(time1[0]);// 0
		
		time1[0] = 10;				// hour
		time1[1] = 15;				// minute
		
		time2[0] = 9;				// hour
		time2[1] = 10;				// minute
		
		// Before comparing, check if both arrays have
		// valid hour/minute
		
		
		// else-if olarak da yapilabillir
		if(time1[0] < 0 || time1[0] > 23) {					// index [0] representing hour
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minute");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		
		if(time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minute");
			return;
		}

//*************************************************************************************************************
		
		// COMPARE ARRAYS and tell which one is earlier
		//compare hours
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else {											// hours are equal, check minutes
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if(time2[1] < time1[1]) {				// compare minutes 
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same Time!");
			}
		}
		
	}

}
