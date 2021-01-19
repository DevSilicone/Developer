package day40_customclasses__methods;

public class X04_CellPhone { 
		
	String brand; 				// null
	double screenSize;			// 0.0
	String color;				// null
	double price;				// 0.0
		
	
	public void call() {
		System.out.println("Calling ....");
		
	}
	
	public void message() {
		System.out.println("Sending txt message .... ");
		
	}
	
	public void takeAPhoto() {
		System.out.println("Taking a photo ...");
	}
	
	
	public static void main(String[] args) {
		
		// it is not going to compile firt. =>only way to use from method is to create first then you can usethis variable.
		// ##System.out.println(brand);##
		// above line will not work, we need object to use brand
		// Create CellPhone object
		
		X04_CellPhone cell1 = new X04_CellPhone();
		
		System.out.println(cell1.brand);		// null
		System.out.println(cell1.screenSize);	// 0.0
		
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;
	
		System.out.println("Brand: " + cell1.brand);
		System.out.println("screenSize:  + cell1.screenSize");
		System.out.println("color: " + cell1.color);
		System.out.println("price: " +cell1.price);
		
		
	
	}
}
