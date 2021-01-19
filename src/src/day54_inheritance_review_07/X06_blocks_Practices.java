package day54_inheritance_review_07;

public class X06_blocks_Practices {

//	static variable
	static String names;				//=>1) diger bloklara bunu initialize etmek istiyoruz.	//=> eger static ise butun bloklara dogrudan cagirabiliriz.
	

	static {							//=>2) static block always first one execute
		names = "John";					//=>2) we initialized it.
	}
	
	
	{									//=>3) instance block
		names = "Aaron";				//=>3) we initialized it.					//=> in it blok ve constructor => object create etmeden dogrudan run olmaz.
	}
	

	
	public X06_blocks_Practices() {			//=>4) constructor						//=> in it blok ve constructor => object create etmeden dogrudan run olmaz.
		names = "Bush";					//=>4) we initialized it.
	}
	
//	instance variable					//=>5)	INSTANCE VARIABLE object icerisinde degerlendirildigi icin asagida ikici sonuc print oluyor.
	int num1 = 10;
	
// 	static variable
	static int num2=10;					//=>6)	Static variable ise CLASS icerisinde degerlendirilmis oluyor, iki tana static var class'da asagida
										//=>6)	Biz bu class icerisine once 20 atadik => sonra o 20 artik degerlendiriliyor class icerisinde => 10 gitmis oluyor. 
	
	public static void main(String[] args) {
		
		System.out.println(names);							//=> 1) dogrudan run olabiir static blok oldugu icin		=> object create etmeden
															
															//=> 2) run olmuyor => cunki in it block icerisinde "Aeron" u gittik re-initialize ettik => constructor icine => o yuzden gitti last assign value olan "Bush" aldi
		X06_blocks_Practices obj = new X06_blocks_Practices();		//=> 2-3) in it block ve constructur run olsun diye OBJECT create ettik.
		System.out.println(names);							//=> 3) fakat compiler initialize edip - run ettiginde SON olani yaptigi icin => Bush print olur	
		
		
		X06_blocks_Practices obj1 = new X06_blocks_Practices();			
						obj1.num1=20;						//=> 5) 
//		System.out.println(obj1.num1);						//=> 5)			=> eger instance variable 
						obj1.num2=20;						//=> 6) 
						
		X06_blocks_Practices obj2 = new X06_blocks_Practices();		//
		System.out.println(obj2.num1); 						//=> 5) 10		=> instance variable object'e ait oldugu icin, burada print ederken en yukari gidip kendi degerini aldi
		System.out.println(obj2.num2);						//=> 6) 20		=> static variable ise class'a ait oldugu icin, class icerisinde verilmis 20 degerini aldi ve print etti.
		
	
	}
	
}
	
	
	
	

