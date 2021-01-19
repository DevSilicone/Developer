package day28_multi_d_arrays;

import java.util.*;

public class ArrayPractice7 {

	public static void main(String[] args) {
		
		// ### Countries ###
									//  0 -    1
		String[][] countriesArray = {
									{"USA", "Washington DC"},		//0
									{"Canada", "Ottowa"},			//1
									{"Mexico", "Mexico city"},		//2
									{"Brasil", "Brasilia"},			//3
									{"Peru", "Lima"},				//4
									{"Argentine", "Boanes Aeros"},	//5
									{"Bollivia", "La Paz"},			//6
									{"Macedonia", "Scopia"},		//7
									{"Kazakhstan", "Nursultan"}	//8			
									};

		// String[][] c = new String[9][2];
		// c[0][0] = "USA"; c[0][1] = "Washington DC"
		// print USA with Capital city
		
		System.out.println(countriesArray[0][0] + "|" +countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" +countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));

		System.out.println("*****************************************************************************************");
		
		// print all the countries in same line separated by |
		//1) for loop
		
		for(int i = 0; i < countriesArray.length;  i++) {
			System.out.print(countriesArray[i][0] + "|");
		}
		
		System.out.println();
		System.out.println("******************************************************************************************");
		
		//2) for each loop
		
		for(String[] country : countriesArray) {
			System.out.print(country[0] + "|");		//=> [0] koyuyoruz ki sadece ulkeleri print icin. ulkelerin oldugu kolon sifirda oldugu icin.
		}
		
		
		System.out.println();
		System.out.println("*********************************************************************************************");
		
		
		// get all the Cities and add to cities[] array
		// declare cities and size needs to match countries Array size
		
		String[] cities = new String[countriesArray.length]; 		//=> Citie olanlari yeni bir Array yapmak // declare
		System.out.println(Arrays.toString(cities));				//=> null its not pointing to any object. its not same as empty string
		
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];						//=> [1] cities Array  // bu duzenlemeden sonra yeniden print edebilmis olduk.
		}
		
		System.out.println(Arrays.toString(cities));
		

		System.out.println("*********************************************************************************************");
		
		// Look for Bolivia in the countriesArr and test if			=> sunun karsili su mu diye test ediyoruz.
		// capital city is "La Paz"
				
		
		for (int row = 0; row < countriesArray.length; row++) {
			
			if(countriesArray[row][0].equals("Bollivia")) {
				System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bollivia test passed");
				}else {
					System.out.println("Bollivia test failed");
				}
				break;											//=> exit the loop
			}
		}
		

		
		
		
		
		
		
		
	}

}
