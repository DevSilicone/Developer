 package day24_arrays01;

public class Arrayss12 {

	public static void main(String[] args) {
		
		
		int[][] ducks = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		System.out.println("Ducks:" + ducks.length);
		
		
		
		int[][] ducks1 = {{1, 2, }, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		System.out.println("Ducks:" + ducks1[0].length);		//==> buraya yazilan [0] ilk parantez icinde kac adet var
		
		
		
		int[][] ducks2 = {{1, 2, }, {1, 2, 3, 4, }, {1, 2, 3, 4, 5}};
		
		System.out.println("Ducks:" + ducks2[1].length);		//==> buraya yazilan [1] ikinci parantez icinde kac adet var 
		
		
		
		
		System.out.println("***************");
		
		
		int[][] ducks3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		System.out.println(ducks3[2][2]); 	//==> 13 (her satirda 0'dan baslayarak say)
		
		
		
		int nums [][] = new int [5][5]; 	// ==> bu sekilde de yapilabilir.
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
