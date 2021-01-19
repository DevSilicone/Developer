package day37_arraylist;

import java.util.ArrayList;

public class X01_ArrayListIntro {

	public static void main(String[] args) {
		
		// Create an arraylist
		String[] namesArr = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();

		
		// assign values into arraylist
		
		names.add("Yavuz");				//=> you can add how many you want. no limit. not like array. 
		names.add("Selim");
		names.add("Ozturk");
		
		nums.add(new Integer("100"));
		nums.add(100);
		nums.add(99);
		nums.add(656);
		
		
		// read from arraylist
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
	}
}
