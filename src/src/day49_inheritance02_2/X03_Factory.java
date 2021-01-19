package day49_inheritance02_2;

//ZFactory is a NON-Subclass that is in same package
public class X03_Factory {

	public static void main(String[] args) {
		
		X01_Device dv = new X01_Device();
		dv.brand = "LG";
		
		dv.model = "3300"; // BUNU SONRADAN EKLEDIK - PROTECTED denemek icin - calisiyor-cunku ayni package
		
		dv.price = 1000; // SONRADAN EKLEME - DEFAULT var. - AYNI PACKAGE oldugu icin calisiyor
		
		// dv.country = "USA"; => PRIVATE oldugu icin bu class a erisemiyor - NOT INHARITED
	}
	
	
}
