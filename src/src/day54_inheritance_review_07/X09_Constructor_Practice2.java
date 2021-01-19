package day54_inheritance_review_07;

class lion{
	
	
	public lion(double b) {					//=> sonradan ekledik
		
	}
	
	public lion(int a) {					//=> constructor with ARGUMENT			=> you must have to call it in SubClass
		System.out.println("A");			//=> beacuse it's not NO-ARG constructor(default)
	}
}											//=> 2. yol eger usttarafa default constructor yaprsak bir tane, asagida constructor acip cagirmamiza gerek kalmaz.
											//=> baska da yol yok.





public class X09_Constructor_Practice2 extends lion {	//=> sub cass yaptik

	// only constructor can call the constructor in this class ( yukaridaki no-args constructor'i sadece bu sub classta yeni constructor acarak cagirabilirz.
											
											//=> reason is numbe #12
//	Constructor_Practice2(){				//=> if you don't put super, it will gice a compiler error
//			super(9);						//=> because we have a contructor method, and now compalier
											//=> default oldugu icin (it's call by itself	(if it's not default you call by yourself
//	}										//=> yukaridan istedigimizi cagirabiliriz. hangisini isterdek (tabi default constructor yok ise sub classta)
	
	X09_Constructor_Practice2(boolean b){		
		super(9);							
	}
	
}
