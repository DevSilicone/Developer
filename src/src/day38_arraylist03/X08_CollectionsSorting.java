package day38_arraylist03;

import java.util.*;

public class X08_CollectionsSorting {

	public static void main(String[] args) {
		
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);
		
		System.out.println("Sorting... please wait...");
		
		Collections.sort(numsList);
		System.out.println(numsList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Yavuz");
		strList.add("Selim");
		strList.add("Ozturk");
		
		System.out.println(strList);
		
		System.out.println("Sorting... please wait...");
		
		Collections.sort(strList);
		System.out.println(strList);
		
		
		//MAX, MIN								// alphabetic siraya gore duzenliyor
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		System.out.println("maxNum: " + maxNum);
		System.out.println("maxNum: " + minNum);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println("maxName: " + maxName);
		System.out.println("minName: " + minName);
		
		Collections.shuffle(strList);			// 
		System.out.println(strList);
		
	}

}
