package day37_arraylist02;

import java.util.*;

public class X03_RemoveInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);
		
		nums.add(4);
		nums.add(1);
		nums.add(4443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		nums.remove(5);
		
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);				// once deger atayarak remove yapilabilir
		Integer n2 = Integer.valueOf(5);
		
		nums.remove( n1 );
		nums.remove((new Integer (4)));				// bu sekilde de remove yapilabilir
		System.out.println(nums.toString());
		
		
		
		//nums.remove("5");
		System.out.println(nums.toString());
		
		
		
	}

}
