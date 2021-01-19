package day40_customclasses__methods;

public class X05_BestBuy {
	 
	public static void main(String[] args) {
		
		
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
		
		
		System.out.println();
		
		cell1.color = "Black";
		System.out.println("color: " + cell1.color);
		
		System.out.println();
		
		
		X04_CellPhone cell2 = new X04_CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println();
		
		System.out.println("#### CELL 2 VALUES ####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize:  + cell1.screenSize");
		System.out.println("color: " + cell2.color);
		System.out.println("price: " +cell2.price);
		
		System.out.println();
		
		System.out.println(" #### CALLING METHODS #### ");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		cell2.call();
		cell2.message();
		cell2.call();
		cell2.takeAPhoto();
		
	}
}
