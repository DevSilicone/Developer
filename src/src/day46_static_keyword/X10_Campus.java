package day46_static_keyword;

public class X10_Campus {

	// String city; => bu da ilk yaptigimiz ornekten
	
	//bunlar son ornek olarak
	private String city;
	static String country;
	
	
	
	
// ilk bu kismi olusturduk =====================================================================================	
											// Static Block
	{								// otomation we don't have to use this
		System.out.println("non-static block -1 ");	// in development you have to use kind of things, a lot of firame work.
		country = "USA";	// bu kismi da sonradan ekledik 
							// you can initialize one time in your block - yukariya yazdigimizi block bir kez ekliyoruz.
	}
	
	
//sonradan ekleme ============================================================================================
	
	static {
		System.out.println("static block - 2");
		country = "Canada";
		
	}
	
//===============================================================================================================	
	public X10_Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
		
//========================================================================================================================
	
	// ENCAPSULATION
	
	// getter - setter 	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
//=======================================================================================================================	
	
	public static void campusInfo() {
		System.out.println("Welcome to campus!");
		
	}
	

}
