package day24_arrays01;

public class Arrays3 {

	public static void main(String[] args) {
		
		// ## ALL POSSIBLE COMBINATION ###
		
		// WarmUp - LOOP - NESTED LOOP INSIDE
		
		// ## once a'nin tum harfler karsiligini print ediyor, sonra b, sonra c
	
		
		for(char i = 'a'; i <= 'e'; i++) {
			for (char var = 'a'; var <='e'; var++) {
				System.out.print(i);
				System.out.println(var);
			}
			
		}
		
	}

}
