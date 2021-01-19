package day18_while_loop;

public class WhileLoop6 {

	public static void main(String[] args) {
		
		char letter = 'a';
		System.out.println(letter);
		letter++;
		System.out.println(letter);
		letter++;
		System.out.println(letter);
		letter++;
		System.out.println(letter);letter++;
		
		System.out.print(letter);letter++;
		System.out.print(letter);letter++;
		System.out.print(letter);letter++;
		System.out.print(letter);letter++;
		
		System.out.println();
		
		while(letter <= 'z') {				// tek tirnak icerisinde cunku char 
			System.out.print(letter +" ");  // cift tirnak bosluk birakinca arada bosluklar olusur
			letter++;
		}
		
		//===================
		System.out.println();
		//===================
		
		char capitals = 'A';
		
		while(capitals <= 'Z' ) {
			System.out.print(capitals + " ");
			capitals++;
		}
		
		
		//==================
		System.out.println();
		//==================
		
		
		char reverse = 'z';
		
		while(reverse >= 'a' ) {
			System.out.print(reverse + " ");
			reverse--;
		}
		

	}

}
