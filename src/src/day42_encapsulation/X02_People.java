package day42_encapsulation;

public class X02_People {

	
	// diger class da olanlari buraya aliyoruz
	public static void main(String[] args) {
		
		X01_Person p1 = new X01_Person();
		// p1.age = 1;						// bize geter and setter opsiyonu sunuyor bu normalde de oyle yapiliyor uzerine getirince
		// p1.name = "Jim";					// not visible - yukaridaki de bu da
		
		
		
	
		
		p1.setName("Alexander");
			
		System.out.println(p1.getName());
		
		 
	}
	
}
