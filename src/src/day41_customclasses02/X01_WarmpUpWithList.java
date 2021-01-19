package day41_customclasses02;

import java.util.*;

public class X01_WarmpUpWithList {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));				// iki ile carptik asagidaki class ile
		
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);							// iki ile carptik diger class kullanarak
		
		
	}
	
	public static List<Integer> doubleTheList(List<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) *2);
		}
		return nums;
		
	}	
}
