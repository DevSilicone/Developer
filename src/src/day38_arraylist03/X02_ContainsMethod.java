package day38_arraylist03;

//import java.time.Month;
import java.util.*;

public class X02_ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1;					// list1, list2 point to same object
		
		ArrayList<String> months = new ArrayList<>(list1);  // copy all values from list1
		
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		// [Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]
		System.out.println(months);
		System.out.println(months.contains("jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.contains("Jun"));
		
		// how would you check if Feb is in second position
		// months.clear();									// bu durumda yapinca out of bound expection oluyor
		System.out.println(months.indexOf("Feb") == 1 );
		System.out.println(months.get(1).equals("Feb"));
		
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		
		System.out.println("Month: " + months2.toString());
		System.out.println("Month: " + months2.toString());
		
		
		// check if month has all the values of Month2
		if(months.containsAll(months2)) {
			System.out.println("Months has all of Month2");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		
		//add one more jan to monyh2
		months2.add("Jan");
		if(months.containsAll(months2)) {
			System.out.println("Months has all of Month2");
		}else {
			System.out.println("Some values are missing");
		}
		
			
	}
}
