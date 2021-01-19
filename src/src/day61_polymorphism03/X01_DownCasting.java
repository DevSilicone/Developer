package day61_polymorphism03;

import day60_polymorphism02.*;

public class X01_DownCasting {

	public static void main(String[] args) {

		X01_AppleDevice appDev = new X03_IPad();
		
		//appDev can access use method, startingPrice variable
		appDev.use();
		
//		appDev.draw();			=> not accessible
		
		//how to call draw method from IPad
		
		X03_IPad ipad = (X03_IPad) appDev;						//=> 
		ipad.use();
		ipad.draw();
		
		X01_AppleDevice dev2 = new X02_Mac();
		dev2.use();
		
//		1) using another reference variable
		X02_Mac mac = (X02_Mac)dev2;
		mac.code();
		System.out.println(mac.model);
		
//		2) cast and call in single statement
		((X02_Mac)dev2).code();
		System.out.println(((X02_Mac)dev2).model);
		
		
		// String str = (String)dev2;				//=> not relaited inheritance
		
		double d = 123.45;
		int j = (int)d;			//=> casting
		
		System.out.println(((int)d));
		
		
		
		
		
		
	}

}
