package day42_customclasses03;

public class X01_Coffee {

	/**
	 * instance variable:
	 * name
	 * size										// bu kisim comple ## DATA ##
	 * price
	 * calories
	 * */
	
	String name;								// bu kisim comple ## DATA ##
	String size;	
	double price;
	int calories;								// bu kisim comple ## DATA ##
	
	
	
	/**
	 * getCoffeeInfo							//#### BU KISIMDAN ASAGISI "METHOD" => BEHAVIOR
	 * print above data
	 * */
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+" "+size.toUpperCase()+" $"+price+" "+calories+ "CAL";
		System.out.println(info);
	}
	
	/**
	 * setName
	 * void
	 * String newName
	 * 
	 * it will assign newName to name instance variable
	 * */

	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") ||
			newSize.equalsIgnoreCase("grande") ||
			newSize.equalsIgnoreCase("venti")) {
			size = newSize;
			size = newSize;
		}else {
			System.out.println("ERROR: Invalid Size - " + newSize);
			size = "unknown";
		}
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCal) {
		calories = newCal;
	}
	
	public void setCoffeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);						// set size olarak yapilan ornek 
		price = newPrice;						// bu methodlarin yerine set size olarak yapiyoruz/ cunku tekrar kullanabilmek icin.
		calories = newCal;
		
	}
	
	
	
	
	
}
