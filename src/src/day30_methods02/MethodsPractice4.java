package day30_methods02;

import java.util.*;

public class MethodsPractice4 {

	public static void main(String[] args) {
		
		do10PushUps();
		do10PushUps();
		do10PushUps();
		do10PushUps();	
	}		
		/*
		 name: do10PushUps
		 return type: void
		 params: no
		 print:
		 Pushup - 1
		 Pushup - 2
		 Pushup - 3
		  ..
		 Pushup - 10
		 time to rest
		 **/

		public static void do10PushUps() {
			for(int j = 1; j <=10; j++) {
				System.out.println("Pushup - " + j);
			}
			System.out.println("Time to rest");
		}
						
}

	
	
	
	
	
	
	

