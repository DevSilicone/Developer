package day19_do_while_loop_02;

public class DoWhile {

	public static void main(String[] args) {
		
		//print 1 to 10 using do while loop
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		// write a do while loop to calculate some of number 
		// between 1 to 5
		// 1+2+3+4+5 ==> 15
		
		int sum = 0;
		int j = 1;
		
		do {
			sum = sum + j;
			j++;
		}while(j <= 50 );
		
		
		System.out.println("Sum from 1 to 5 is " + sum);
		

	}

}
