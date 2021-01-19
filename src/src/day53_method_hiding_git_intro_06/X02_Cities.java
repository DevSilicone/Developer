package day53_method_hiding_git_intro_06;

public class X02_Cities {

	public static void main(String[] args) {
		
//		We OVERROAD 2 METHODS from java OBJECT CLASS. 
		
													// => we describe the object (CITY)
		X01_City boston = new X01_City(123, "Boston");		// => we wrote our own.(diger city olan classta) => @Overriding yaptik ayrica. 
		System.out.println(boston.toString());		// => Automaticly call the toString method.

//		==========================================================================================================================		
		
//		Compare them
//		variable name are different		
//		can we equal them?	
		
		X01_City istanbul = new X01_City(444, "Istanbul");			// => 
		X01_City anotherCity = new X01_City(444, "Istanbul");	// =>

//		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Does not equal");
		}
		
		System.out.println(istanbul.toString());
		System.out.println(anotherCity.toString());
		
//		===========================================================================================================================		

//		hashcode									=> hashcode is hashcode					=> hashcode is like ID for the objects.	
//													=> whenewer you create an object it gives you an ID
//													=> it can be unique most of the time	=> sometimes multiple object can share same hashcode.
		System.out.println(boston.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		X03_Capital cap = new X03_Capital(101, "Washington DC", 800_000);
		System.out.println(cap.toString());
	}

}
