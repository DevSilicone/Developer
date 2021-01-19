package day46_static_keyword;

public class X09_Vehicle {
	
			//### STATIC ORNEGI - DIKKATLI INCELE ##

	String type;					// instance variable - NON STATIC
	static int numberOfVehicles;	// SHARED, one central value, STATIC
	
	
	/* 										
	 * public static void vehicleInfo() {		
		 System.out.println("type: " + type);	// this will not work. static // cunku static degere referans gidemez bu sekilde
	} 											// static method icinde non-static olamaz.
	*/
	
	public static void vehicleInfo() {
		System.out.println("numberOfVehicle: " + numberOfVehicles);	// ustteki ile karsilastir.
																	// it will work
																	// static method icerisinde, static olani koyduk
		int count = getNumberOfVehicles();	// bunu sonradan ekledik
											// eger asagidakinden static yazisini kaldirisak calismaz. suan calisir.
											// sebebi static sadece diger statici cagirabilir
						// asagida class acip static degeri cagirdigimiz cagirdigimiz icin calisiyor.
						// cunku get olarak asagidan referans alarak bunu yukari atadik
						// asagisi static olmaktan cikarsa bu da cikar ve calismaz static method icerisinde
								
		
								// istedigimiz her zaman static icerisine object bu sekilde create edebiliriz.
		String make = "Kia";	// local variable oldugu icin istedigimiz gibi bununla hareket edebiliriz.
		make = make.toUpperCase(); // call yapabiliriz bu sekilde objectden. most populer object (string object) olarak cagirdik. toUpperCase(string object)
		System.out.println("make: " + make);
				// you can create object and call methods any time => static icerisinde ise eger.
		
		
		
		// System.out.println(toString())); // bunu da en altta bulunan stringten referans alip yazdik buraya
										 	// it will not work
											// eger declare edersek kendi own class'imizda o zaman calismaz
			//** bunu da asagida ayrica class icerisinde create edip declare ettik. normalde calirdi(yani toUpperCase gibi, o da string class ama declare edilmedi.
	
		
										// ustteki yesilin icerisinde oldugu gibi direk cagirsak limitation var.
		// Vehicle vh = new Vehicle();	// vh olarak local object olusturdugumuz icin, we can call anything
		// vh.toString();
	}																
		
	// ustteki (toUpperCase) burada yaparsak static disinda o da calismaz kesinlikle.
		
		
		
	
	
//*********************************************************************************************************************************	
	
	
	
	public static int getNumberOfVehicles() {						// bu private degil ama yine de method ornek olarak yaziyoruz.
		return numberOfVehicles;									// ikisi de static oldugu icin calisir
	}
	
//********************************************************************************************************************************
	
	
	
										// non-static can access -> STATIC
	public String toString() {			// non-static		// will work // String -> numberOfVehicle a geliyor, bu kisim da calisir
		return "Vehicle type: " + type + " | count: " + numberOfVehicles;
	}

}
