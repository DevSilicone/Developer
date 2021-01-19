package day53_method_hiding_git_intro_06;

public class X04_TestHiding {
	
	public static void main(String[] args) {
		
		X01_City city = new X01_City(345, "London");
		X03_Capital cap = new X03_Capital(433, "Paris", 53232435L);
																//	=> inhereted olan.
		System.out.println(city.count);							//	=> super class(city) oradan ayni isim ve ayni data turu ile buraya declare ettik.
		System.out.println(cap.count);							//	=> bunu sub class(capital)' oradan ayni isim ve ayni data turu ile buraya declare ettik.
																//	=> iki class icerisinde bulunan data turu ve ismi ayni olmasina ragmen, printler farkli
																// 	=> yani sub class'a verdigimiz deger ne ise o print oluyor, super class icerisinde olan degil.
		
		System.out.println(city.toString());					//	=>
		System.out.println(cap.toString());						//	=> capital show 100	=> burada sub class'da ayrica deger vermedigimiz icin.
																//	=> sadece city'de olan degeri buraya print ediyor.
		
		cap.displayCount();										//	=> sub class da verdigimiz degerler city count = 100, capital count = 1
																//	=> city count'a super. olarak ust class'dan altik o yuzden = 100
		System.out.println();									//	=> capital count'a print etmeden once super. yapmayi, kendi class'indaki degeri ile biraktik.
		
//		call static methods
		city.buildARoad();										// => which class you calling from it choising that version
		cap.buildARoad();
		
		X01_City.buildARoad();
		X03_Capital.buildARoad();
		System.out.println();
		
		X01_City city2 = new X01_City(33344, "Amsterdam");
		X03_Capital capital2 = new X03_Capital (6544, "Lisbon", 5432213L);
		
		city2.letsBuildARoad();									// => City 
		capital2.letsBuildARoad();								// => City (even no inhereted but still go inside the City => )
		
		
	}

}
