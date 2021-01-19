package day52_final_keyword_05;

public class X01_FinalVariables {

	// 	Instance variable => outside the method inside the class demektir. yani bu alan. 
	// 	asagidaki cizgi sonrasi STATIC alan. ve bu alandakiler direkt olarak Static alan tarafindan okunamaz. okunabilmesi icin OBJECT olusturmak gerek.
	
	//	public final int ROADSTER_MAX_RANGE; => "STATIC CAN NOT TALK TO instance variable" => instance variable=> method disinda, class icerisinde
		
	
	//	### WHEN IT(FINAL) COMES TO INSTANCE VARIABLE there is a small rule ####
	//		when we declare any variable as FINAL
	//												=> 1) yol => we have to assign value rihtaway, 
	//												=> 2) yol => or in the constructor
	//												=> 3) yol => or INIT block						=> we need the choose one of this.

	
	public final int ROADSTER_MAX_RANGE = 610;		// 1. yol "Assign the value" buraya.
	public final String Jan = "January";			// Bu da 1. yola ornek, burada "January" diye atadin ve degistirilemez, buyuk kucuk harf farketmeksizin. 
	
	public final int MODEL_3_MAX_SPEED;				// 2. yol
	public final int MODEL_X_PASSENGERS;			// 3. yol
	
	
													
	
//	(ikinci yol da asagidaki iki sekilde olabilir)
	
//	public FinalVariables(int num)					// 2. yol constructor yapip
//	 	MODEL_3_MAX_SPEED = num;					// => Consrtuctor icine alarak "INITIALIZE"yaptik.

	public X01_FinalVariables() {						// => Constructor yaptik buraya, instance variable okuyabilmek icin.  
		MODEL_3_MAX_SPEED = 180;					// => Constructor variable "STATIC VOID" koymadan olur.
	}
	
		
	{
		MODEL_X_PASSENGERS = 7;						// => 3.yol  " IN IT block "
	}
		
	//	=====================================================================================================================================														
	
	public static final String COMPANY_NAME = "YSO";	// => static oldugu icin sadece en alttaki STATIC METHOD' da kullanilabilir 
	
//  public static final String ADMIN_USERNAME; 			// constructor olamaz - IN IT olamaz - Ya ustteki gibi direk deger atanir, yada STATIC alanda, alttaki gibi.		 
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	 
	
	
	//	==================================================================================================================================	
		
	public static void main(String[] args) {
		
	//	Method icerisinde oldugu icin bunlarin hepsi LOCAL veriable'dir.
		
		final int MAX_PASSENGERS_COUNT = 5;				// final local variable
	// 			  MAX_PASSENGERS_COUNT = 10;			// degistiremezsiniz
		
		final double PI = 3.14159265358979323846;
	//  PI = 4.667885432 -> degismez final keyword
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN = 321456989;
	//	SSN++=;											// is not possible 
		
		
		
	// 	bu alan main method
	// 	main method can not access instance variables directly, we need to creat object first.
	// 	en ustteki degeri buraya OBJECT yaptik
		
		X01_FinalVariables finalvars = new X01_FinalVariables();								//=> OBJECT
		System.out.println("Max range for roadster: " + finalvars.ROADSTER_MAX_RANGE);		
		System.out.println("Max 3 max speed: " + finalvars.MODEL_3_MAX_SPEED);
		System.out.println("Model x passenger: " + finalvars.MODEL_X_PASSENGERS);
		
	// System.out.println("Max range for roadster: " + ROADSTER_MAX_RANGE); => Bu sekilde direk yukarida bulunan instance variable buraya method'a alamazsin.
		
//=============================================================================================================================================================		

	// 	bu demek degil ki PUBLIC FINAL static olamaz. PUBLIC STATIC FINAL olarak atasaydik, direk ulasirdi.
	// 	STATIC CLASS is mean MATH class. => static final variables
		
	// 	Math.PI				=> bunlar static variable oldugu icin, buraya initilaize edebilirsin. STATIC BLOCK'A - SAME STATEMENT
	// 	Math E
		System.out.println(Integer.MAX_VALUE);
		
		
																// yukaridaki STATIC methodumuz ayni CLASS icerisinde oldugu icin direk
		System.out.println("Company name: " + COMPANY_NAME);	// ayni classta oldugu icin direk print edebiliyoruz STATIC yaptigimiz yukaridaki degerleri.
		System.out.println("Company name: " + X01_FinalVariables.COMPANY_NAME);
		System.out.println("Admin: " + ADMIN_USERNAME);
		
		
	}

}
