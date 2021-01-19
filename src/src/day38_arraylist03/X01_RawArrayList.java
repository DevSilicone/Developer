package day38_arraylist03;

import java.util.ArrayList;

public class X01_RawArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		
		System.out.println(list);			 // it will automatically call toString() 
		
		String allValues = list.toString(); //
		System.out.println(allValues);

		String str = list.get(0).toString();
		System.out.println(str);
		// all values are store as a raw type. we can also call it,
		// as a General object type.
		
		Integer i = (Integer)list.get(2); // downcasting
		System.out.println(i);
		
		
		
	}
}
