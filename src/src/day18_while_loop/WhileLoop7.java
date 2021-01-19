package day18_while_loop;

public class WhileLoop7 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 A
		 AB
		 ABC
		 ABCD
		 ABCDE
		 ABCDEF
		 ABCDEFG
		 */
		
	
		String letters = "";
		letters = letters + 'A';
		System.out.println(letters);
		
		letters = letters + 'B';
		System.out.println(letters);

		letters = letters + 'C';
		System.out.println(letters);

		letters = letters + 'D';
		System.out.println(letters);

		letters = letters + 'E';
		System.out.println(letters);

		letters = letters + 'F';
		System.out.println(letters);

		letters = letters + 'G';
		System.out.println(letters);
		
		//==================
		System.out.println();
		//==================
		
		String letters2 = "";
		char myLetter = 'A';
				
		while(myLetter <= 'Z') {
			letters2 = letters2 + myLetter;
			System.out.println(letters2);
			myLetter++;
			Thread.sleep(450);
		}
		
	
	}

}
