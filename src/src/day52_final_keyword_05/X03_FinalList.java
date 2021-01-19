package day52_final_keyword_05;

import java.util.*;

public class X03_FinalList {
	
	// ===============================================================================================================================================
	
	// 	BU kisim ayri bir OBJET oldugu icin MAIN method'un uzerine CREAT edildi. ORNEK OLARAK - Final keyword'e kucuk bir ornek (sadece ArrayList'e degil)
	// 	Small rule		-> 
	// 	public 			-> access modifier
	// 	final, static	-> non-access modifier(we can say), (IDENTIFIER) 
	
		public static final String COLOR = "Pink";			// Data Type ve Variable degistirilmedigi surece yontemlerin hepsi gecerli.	
		final public static String COLOR1 = "Pink";
		final static public String COLOR2 = "Pink";
		static final public String COLOR3 = "Pink";
		
	//	public static "String" final "COLOR" = "Pink";		// Data type (String is Class name) ve Variable name yerleri degistirilmis. Bu yontem olmaz.
	
	// ================================================================================================================================================
	
	public static void main(String[] args) {
	
	// 	NORMAL ARRAYLIST
		
		ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");								// normal ArrayList oldugu icin item ekleyebiliyoruz, cikarabiliyoruz
		System.out.println(COLORS.toString());
	
		
	//	YENI OBJECT CREATE edebiliyoruz.
	//	new gordugun zaman, new object oluyor.
		
		COLORS = new ArrayList<>();							// new object - (yeni bir object olusturdugumuz icin istedigimizi ekleyip cikarabiliriz)
		System.out.println(COLORS.toString());				// burasi empty print olur (yeni bir sey eklemedigimiz icin
		COLORS.add("Yellow");
		System.out.println(COLORS.toString());				// olusturdugumuz object'e yeni item ekledikten sonra YELLOW olarak print oluyor.
		
		System.out.println();
	// ===============================================================================================================================================
		
	//	FINAL ARRAYLIST
			
		final ArrayList<String> COLORS1= new ArrayList<>();	// We can assign an object  using keyword
		COLORS1.add("Orange");								// and add or remove/update any values
		COLORS1.add("Grey");								
		COLORS1.add("White");								// Final Arraylist'de de "new' ile yeni bir object acabiliyoruz,
		COLORS1.add("Blue");								// ama bunu baska bir object olarak tekrar acamiyoruz.
			
		System.out.println(COLORS1.toString());
		COLORS1.add("Black");								// FINAL arrayList de olsa, element ekleyip cikartabiliriz.
		System.out.println(COLORS1.toString());
		
			
	//	YENI OBJECT CREATE edemiyoruz (CAN NOT)				// We cannot re-assign it to another object alltogether using new keyword.
		
	//	COLORS1 = new ArrayList<>();						// kirmizi olarak hata gosterir
	//	System.out.println(COLORS1.toString());				
	//	COLORS1.add("Yellow");								// yeni OBJECT create edemedigimiz icin, yeni element ekleyemeyiz, degistereyiz de.
	//	System.out.println(COLORS1.toString());				// print de edemeyiz.
			
		
	}
}
