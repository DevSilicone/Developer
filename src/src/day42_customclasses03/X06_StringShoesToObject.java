package day42_customclasses03;

import java.util.*;

import java.lang.*; // string class hepsi. always import// this import is always added by compiler

public class X06_StringShoesToObject {

	public static void main(String[] args) {
		
		// create shoes object and assign the data from the String data
		String data = "Bruni Magli, 9.5";
		
		//split using, and store into array
		String[] arrData = data.split(",");
		
		//create Shoes object
		X04_Shoes shoes = new X04_Shoes();
		
		// shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1])); // convert etmen lazim ve store etmen gerek string dataya. genelde web siteleri veya digerleri hep string kullandiklarini gorursun
		
		shoes.brand = arrData[0]; 					// ustteki ile ayni, ikisi de iyi ama ustteki daha cok common ve kisa yolu var onun
		shoes.size= Double.parseDouble(arrData[1]); // parse convert to double
		System.out.println(shoes.getShoesData());
		

//		=================================================		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What shoes brand?");
		String brand = scan.next();
		
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		
		// create object from these, print out
		X04_Shoes myShoes = new X04_Shoes();
		
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
		
	
	}

}
