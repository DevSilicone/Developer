package day61_polymorphism03;

import java.util.*;

import day57_interfaces.X02_Tesla;
import day60_polymorphism02.*;


public class X02_MethodsUsingPolymorphism {
	public static void main(String[] args) {
	
		purchase( new X02_Mac() );//App;eDevice ap = new Mac();
		
		X01_AppleDevice dev = new X04_AppleWatch();
		purchase(dev);
		
		givemeAnyObject(new String("hi"));
		givemeAnyObject(new Scanner(System.in));
		givemeAnyObject(new X02_Tesla());
		givemeAnyObject(55);				//auto boxing
		int n = 33;
		givemeAnyObject(n);
		
		Object str = new String("Java");	// yukarida olanlar bunlar. yeni object create etmis oluyorsun.
		Object o = new X04_AppleWatch();		// aynisi yukarinin = > polymorphic way.
	
		X01_AppleDevice retDev = buildAppleDevice();
		retDev.use();
		
		
		
		
	}

	//
	public static void purchase(X01_AppleDevice ap) {
		System.out.println("Purchasing: " + ap.getClass().getSimpleName());
	}
		
	public static void givemeAnyObject(Object object)	{
		System.out.println("You gave me: " + object.getClass().getSimpleName());
	}
		
		
	// Method buildAppleDevice, return type: AppleDevice
	public static X01_AppleDevice buildAppleDevice() {
//		AppleDevice ap = new AppleWatch();				//=> return type is appleDevice //=> bu yol ile de yapilabilir.
//		return ap;

		return new X02_Mac();								//=> ustteki de bu yolda olur.
	}
	
	
	/*
	 * You need to know inheritance hierarchy
	 * AppleDevice	> Ipad
	 * 				> AppleWatch
	 * 				> Mac
	 * 
	 * By looking at the hierarch above, it meanss we can write methods
	 * that return or accept AppleDevice and pass any
	 * 
	 * */
	
	public static X01_AppleDevice buildDevice(String type) {		// good example for polymorphic return type
		
		if(type.equals("ipad")) {
			return IPad();
		}else if(type.equals("mac")) {
			return new X02_Mac();
		}else if(type.equals("applewatch")) {
			return new X04_AppleWatch();
		}else {
			return null;
		}
	}

	
	private static X01_AppleDevice IPad() {					//=> bunu en ekledim, hata verdigi icin -  daha sonra tekrar bak
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
}
