package arrays03;

import java.util.*;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		// Popular names
		
		String[] names = {"James", "Mary", "John", "Particia", "Robert", "Jennifer", "Michael", "Linda", "William", "Jessica"};
		
		// print nummber of names in the array
		System.out.println("Total names:" + names.length);
		
		// Print all names in single line
		System.out.println(Arrays.toString(names));
		
//*****************************************************************************************************************		
		
		// Print in column fomrat.
		// 2 names in each line
		// james, mary
		// john, patricia
		
		for(int i=0; i < names.length; i+=2) {					// i+=2 yaptigimiz zaman ikili olarak print ediyor
			System.out.println(names[i] + "," + names [i+1]);	// print yaparken i yazdik, virgul koyduk, [i+1] yapip ikinci ismi da yanina ekledik print yaparken
			
		}
		System.out.println();
		
		// print female name in single separated by comma
		System.out.println("MALE NAMES: ");
		for (int m = 0; m < names.length; m+=2) { 				// ##  += yazmamizin sebebi bir sonrakin atlayabilsin diye/
			System.out.print(names[m]+", ");
		}
				
		System.out.println();
		
		// print female names in sinle line separated by comma
		System.out.println("\nFEMALE NAMES");					// (\n) koymamizin sebebi ustteki line bitrsin yenisine devam etin diye
		for(int idx = 0; idx < names.length; idx++) {
			if(idx % 2 != 0) {
														/*				if(idx == names.length -1) {		== > bu sekilde de yapilabilir.
																		System.out.print(names[idx]);
																	}else {
																		System.out.println(names[idx] + ", ");
														*/			
		System.out.print(names [idx] + ",");
			}		
		}
	
	
//************************************************************************************************************************************					
		System.out.println("\nRANDOM NAME:");
		
		// PRINT 1 random name from this array
		// use Random class
		
		Random random = new Random();
		
		int r = random.nextInt(names.length);			// create a (creative) way with it for solution.
		
		System.out.println("Random name: " + names[r]);
		
		System.out.println();
//***********************************************************************************************************************************		
		// PRINT all names that are up to 4 characters, in uppercase, in same 
		
		for(String name : names ) {						// ((( for each ))) (name : names) yapinca, name -> names in icine gidiyor ve cek etmeye basliyor aradigimizi) 
			if( name.length() <= 4 ) {
				System.out.print(name.toUpperCase() + ", ");
			}
		}
		
		System.out.println();
//***********************************************************************************************************************************
		System.out.println("\nNAMES LENGTH SORT");
		
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore= "";
		
		
		for(String name : names) {
			if(name.length() <= 4 ) {
		    	namesUpto4 += name + ", "; 					// dont forget the put +=
		}else if (name.length() == 5 || name.length() == 6) {
			names5to6 += name + ", ";
		}else {
			names7orMore += name + ", ";
		}
			
	}
		
		System.out.println("namesUpto4	: " + namesUpto4.substring(0, namesUpto4.length()-2));
		System.out.println("names5to6	: " + names5to6);
		System.out.println("names7orMore	: " + names7orMore);
		
		
		System.out.println();
//*******************************************************************************************************		
		
		// SWAP SEATS
		System.out.println(Arrays.toString(names));
		// CODE HERE James, Mary
		
		for(int i=0; i < names.length; i+=2) {					
			String temp = names[i];				// gecici bir temprorary string olusturuyoruz
			names[i] = names[i+1];				// i = i+1 bize yanindaki isim ile degistirtiyor
			names[i+1] = temp;					// i+1 = temp ise degisen i+1 in karsisina ilk olan getiriyor ve islem bitiyor 
		}
		
		System.out.println(Arrays.toString(names));
		

	}
}
