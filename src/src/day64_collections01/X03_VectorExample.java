package day64_collections01;

import java.util.*;

public class X03_VectorExample {

	public static void main(String[] args) {

		List<String> v = new Vector<>();
		v.add("water");
		v.add("tea");
		v.add("tea");
		v.add("grean tea");
		
		for(String str : v) {
			System.out.println(str);
		}

		System.out.println(v.size());
		System.out.println(v.get(3));
		
		v.remove("tea");
		System.out.println(v.toString());
		
		
		
		
		
		
	}

}
