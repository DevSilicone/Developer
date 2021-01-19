package day25_arrays02;

public class ArrayPractice2 {

	public static void main(String[] args) {
		
		// Population Array
		
		int [] population = new int [5];
		
		population [0] = 5000;
		population [1] = 10000;
		population [2] = 7000;
		population [4] = 8907;
		population [3] = 4455;
		
		// int [] population = {5000, 10000, 7000, 4455, 8907 } ==> ustte sira onemli degil, bu yontem kullanildiginda siralama dogru olmali. 
		
		System.out.println("City 0 population: " + population[0]); 
		System.out.println("City 1 population: " + population[1]); 
		System.out.println("City 2 population: " + population[2]);
		
		System.out.println("City 4 population: " + population[4]);
		
		
		System.out.println("City 3 population: " + population[3]);
		
		
		int idx = 0;
		System.out.println("City 3 population: " + population[idx]); 
		
		idx++;
		System.out.println("City 3 population: " + population[idx]);
		
		System.out.println("*******************");
		
		String str = "abc";													//==> burada 3 karakter oldugu icin, asagiyi 3 olarak print ediyor.
		System.out.println("City STR.LENGTH() population: " + population [str.length()]);
		
		
		
	}

}
