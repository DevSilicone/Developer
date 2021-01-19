package day42_customclasses03;

import java.util.*;

public class X05_DSWShoeStore {

	public static void main(String[] args) {
		
		X04_Shoes shoes1 = new X04_Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		System.out.println(shoes1.getShoesData());
		
		X04_Shoes shoes2 = new X04_Shoes();
		shoes2.setShoesData("Allen Edmons", 7.5);
		
		
		X04_Shoes shoes3 = new X04_Shoes();
		shoes3.setShoesData("BOSS HUGO BOSS", 9.0);
		
		
		X04_Shoes[] shoesArray = new X04_Shoes[3];				// we put into array, we declare item - Shoes object
		shoesArray[0] = shoes1;				// each index store actual object - first  index store to first object
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
															// we are reading here
		System.out.println(shoesArray[0].getShoesData());	// first index, shoe object, get shoes data (we can call the method)
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		
		System.out.println(shoesArray[0].brand);			// it gives just  
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		
		
		// ArrayList of Shoes
		ArrayList<X04_Shoes> myShoes = new ArrayList<>();	// arrayList simpler // type is shoes OBJECT TYPE
		
		// store to ArrayList
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(myShoes.get(0).size);			// sadece size print etmek istersek bu sekilde.
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		
		X04_Shoes redShoes = myShoes.get(1);					// tekrar print yaptik allen icin 
		System.out.println(redShoes.getShoesData());
		
		System.out.println("********************************************************");
		
		
		// lets use now for each loop
		for(X04_Shoes shoes : myShoes) {
			System.out.println(shoes.getShoesData());
		}
		
		System.out.println("********************************************************");
		
		// print name of shoes in the list that size is more than 7
		for(X04_Shoes shoes : myShoes) {
			if(shoes.size > 7.0) {
				System.out.println(shoes.brand);
			}
		}
		
		
		
	}

}
