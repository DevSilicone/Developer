package day42_customclasses03;

public class X04_Shoes {

	
	/*
	 * Sring brand
	 * double size
	 * **/
	
	String brand;		// set to data
	double size;			// read to data
	
		
	/*
	 * setShoesData (String newBrand, double nSize) 
	 * */
	public void setShoesData(String abrand, double nSize) {
		brand = abrand;
		size = nSize;
	}
	

	/*
	 * public String getShoesData() {
	 * 			return brand + " | " + size;
	 * */

	// read only
	public String getShoesData() {
		return brand + " | " + size;
	}
	
	
	
	
	
}
