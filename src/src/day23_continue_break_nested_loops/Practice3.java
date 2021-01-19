package day23_continue_break_nested_loops;

public class Practice3 {

	public static void main(String[] args) {
		
		// ### PRINT NUMBER WITH LOOP ###
		
		//this is jus to print numbers from 1 to 10
		
		
		
		//outer loop
		for(int k = 1; k <= 3; k++) {		// bu kisimda alt iki tane islem gouyor sonra bu islem yapiyor. yani iki kez rakam, bir kez star oldu (nested loop)
			
			for(int j = 1; j <= 2; j++) {  // bu kisim alta olan kismi kac kere yazdiracagini gosteryiro (nested loop)
			
				//inner loop
				for(int i = 1; i <= 10; i++) {
					System.out.print(i+" ");
				}
			
				System.out.println();
			}
			System.out.println("**************");
		}
		
		
		
	}

}
