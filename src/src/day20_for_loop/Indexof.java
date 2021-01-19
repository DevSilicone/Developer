package day20_for_loop;

public class Indexof {

	public static void main(String[] args) {
		
		String word = "amazon";
		char letter = 'z';
		int index = -1;
		
		// using for loop and - look for ( IF DEMEK) the letter
		// if it is a match assign value to index
		// exit for loop
		// print value of index
			
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				index = i;
				break;                              //==> break for loop icin bu sekilde kullaniliyor
			}
		}
		
		System.out.println("Index: "+ index); //System.out.println(word.indexOf(letter)); ==> bu yontemde kullanilabilir yukaridaki degerlerin sonuna yazarak.
		
		
		
		
		
		

	}

}
