package day18_while_loop;

public class WhileLoop3 {

	public static void main(String[] args) {
		
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * ..
		 * 100
		 */
		
		int counter = 0;
		
		//    (true) it will go forewer 
		while(counter <= 100) {
			System.out.println(counter);
			counter++;
		}
		
		
		System.out.println("Counter: " + counter);

	}

}
