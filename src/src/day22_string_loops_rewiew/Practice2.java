package day22_string_loops_rewiew;

public class Practice2 {

	public static void main(String[] args) {
		
		// SubString Practice 

		String word = "java" ;
		System.out.println(word.substring(0, 2)); // ja
		
		/*
		 * print each character in separete line using
		 * substring, no loop needed
		 */
		
		System.out.println(word.substring(0, 1)); // j
		System.out.println(word.substring(1, 2)); // a
		System.out.println(word.substring(2, 3)); // v
		System.out.println(word.substring(3, 4)); // a
		
		
		int i = 0;
									  //0 , 1
		System.out.print(word.substring(i ,i+1)); // j
		i++;						  //1 , 2
		System.out.print(word.substring(i ,i+1)); // a
		i++;						  //2 , 3
		System.out.print(word.substring(i ,i+1)); // v
		i++;					 	  //3 , 4
		System.out.println(word.substring(i ,i+1)); // a
		
		
		
		System.out.println("######## FOR LOOP ########");
		// using for loop and substring each character
		// java
		// 0123
		for(int n = 0; n <= 3; n++) {
			// System.out.print(word.substring(n, n+1));  ==> other way
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		
		System.out.println("#####  REVERSE   ##### ");
		
		// print letter in reverse  //  tersten yazma
		
		for(int n = 3; n >= 0; n--) {  // rakamsal degerini veriyor burasi geriye dogru
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		
		int start = 1;
		int end = 8;  //0123567891011
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));
		System.out.println(word2.substring(2, 3)); //i
		System.out.println(word2.substring(6, 7)); //s
		// pass single input. start only and will incluede until last character
		System.out.println(word2.substring(6)); //i
		// print last character
		
		String word3 = "apple";
		System.out.println(word3.substring(word3.length()-1));
	
		String word4 = "UnitedStates";
		System.out.println(word4.substring(word4.length()-1));
		
		
		
		
		
		
	}

}
