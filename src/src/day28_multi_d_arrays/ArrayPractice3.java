package day28_multi_d_arrays;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ArrayPractice3 {

	public static void main(String[] args) throws IOException {
		
		// ### Fast Food Restaurants ###
		
		// read all date and assign to array
		
		String[] data = Files.readAllLines(Paths.get("fastfoodalleghenycountyupdatexy2.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " + data.length);

		
		System.out.println("************************************************************************************");
		
		//print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
			
		System.out.println("************************************************************************************");
		
		// print last restaurant
		System.out.println(data[data.length-1]);
		//System.out.println(Arrays.toString(data)); ==> herseyi tek line yazacagin yapma!
		
		System.out.println("************************************************************************************");		
		
		// print each Restaurant information in separete line
		int counter = 0;											//==> 0'dan basladigi icin
		for(String restaurant : data) {
			System.out.println("#" + counter + "=>" + restaurant);	//==> counter sirasi ile bize print etmesi icin
			counter++;
		}

		
		
		// print all restaurant information take out. also count it
		// and print the number
		
		int countTakeOut = 0;
		for(String row : data) {
			if(row.contains("Take Out")) {
				System.out.println(row);
				countTakeOut++;
			}
		}
		
		System.out.println("######## Total Take Out restaurant: " + countTakeOut);
		
		
		
		// find all restaurant information in state of NY
		// print the restaurant names along with cityname
		
/*		for(String res : data) {
			if(res.contains("Adress")) {
				String [] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
*/							// ==> ekledigimiz listede verdigimiz bilgilerin 0dan baslayip gittigi siraya gore duzenliyoruz.		
		
		
	}

}
