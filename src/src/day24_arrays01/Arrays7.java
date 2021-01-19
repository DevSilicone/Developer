package day24_arrays01;

public class Arrays7 {

	public static void main(String[] args) {
		
		// ##### HOW TO CREATE ARRAY TO CHAR ######
		
		char[] values = {'a','b','c'};
		
		for (char value : values) {
			System.out.println(value);
		}
		
		String str = "Wooden spoon";
		// this method, toCharArray() converts string into
		// array of characters
		
		char[] chars = str.toCharArray();
		
		for(char c: chars) {
			System.out.print(c+"_");
			
		}
		
		System.out.println();
		
		//### REVERS (ters) ###
		
		for(int i = chars.length-1; i >=0; i-- ) {
			System.out.print(chars[i]);
		}
		
		
		System.out.println();
		
		// TASK
		// Print characters with help of array of characters, one by one
		// if characters is equas to 'o', 
		// replace it '*' with (print it instead of 'o');
		
		for(char c: chars) {
		if(c == 'o') {
			System.out.print("*");
		}else {
			System.out.print(c);
		}
		
	}
		
		
		
		
		
		
		
		
	}

}
