package day65_collections03;
import java.util.*;
public class X02_SetOfCities {

	public static void main(String[] args) {
		
		X01_City c1 = new X01_City("London");
		X01_City c2 = new X01_City("London");
		X01_City c3 = new X01_City("Paris");			//=> asagidakilerden sonra burayi london'dan parise cevirirsen hashcode degisir.
		
		Set<X01_City> cities = new HashSet<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		
		System.out.println(cities.size());
		
		System.out.println(c1.hashCode());		//=> hepsi birbirne esit oldugu icin ayni print ediyor
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c1.equals(c2));	//=> burada da onlari cek ediyoruz. true print ediyor.
		System.out.println(c1.equals(c3));
		
//		* those 2 methods are inherited from object class.
//		* if we do not override them, default implementeation inside object class be called.
		
	}

}
