package day37_arraylist02;

import java.util.*;

public class X02_MyCities {

	public static void main(String[] args) {
		
		// ArrayList - MyCities
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		// print each city using for each loop seperated by space
		for(String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();

		
		// print each city using for loop, separated by space
		for(int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");
		}
		System.out.println();
		
		
		// remove Baku
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");				// it will not remove or show error (listemizde yoktu)
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is list empty " + cities.isEmpty()); // false cunku liste empty degil // is not a useful method
		cities.add(0, "Bishkek");								 // listenin en basina baska bir yer ekledik.
		
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");								// listeye yeni bir yer ekledik.
		System.out.println(cities.toString());
	
		cities.set(2, "Seoul");									// barnaul cikarip, yerine seoul'u aldik
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Sterling");					// find strerling in the list and give the index
		System.out.println("Sterling index: " + idx);
		
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString()); 					// Sterling ile zagreb i degistirdik
		
		cities.clear();
		boolean empty = cities.isEmpty();						// listemizi temizledikten sonra, sonuc sordugumuz icin TRUE
		System.out.println("empty: " + empty);
		
		
		
		
	}

}
