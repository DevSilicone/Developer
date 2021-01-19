package day49_inheritance02_4;
		  
		   //SUPER();
public class X01_Animal {
	
	private String type;
	
	
	public X01_Animal() {								// CONSTRUCTOR - Class ile ayni isim olmak zorunda.
		System.out.println("Animal Constructor");
		type = "undefined";	
	}

	// SONRADAN EKLEDIK
	public X01_Animal(String type) {
		System.out.println("Animal 1 arg constructor");
		this.type = type;
	}
	
	
	
	// getter - setter
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	
	
	
	
// bunu animal leopardan buraya aldik - ayni clasta olabilirler - ama biri public olabilir - bu class ile basliyor.

//	class AnimalLeopard  extends Animal{
//
//		
//		public AnimalLeopard() {
//			System.out.println("Leopard constructor");
//			setType("Leopard");
//			
//		}
//		
	
	
}
