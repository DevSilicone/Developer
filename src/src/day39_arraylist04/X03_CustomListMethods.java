package day39_arraylist04;

import java.util.*;

public class X03_CustomListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer>numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		
		
		List<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.80);
		
		System.out.println(sumList(doubleList));
		
		double sum = sumList(doubleList);
		System.out.println("Sum: " + sum );
		
		
		System.out.println(getList(10));			
		ArrayList<Integer> list = getList(15);				//=> date type veriable need to excatly match, return type of this method.
		System.out.println(list.toString());
		
		//for(;;) {											//=> sonsuz tekrar yapiyor
		System.out.println(getRandomList(20));
		//}
		List<Integer> rList=getRandomList(10);
		Collections.sort(rList);
		System.out.println(rList);
		
		printList( (ArrayList<Integer>) getRandomList(7));						// =>
		
		
		
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");
		
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
		
		
		
	}

	public static void printList(List<Integer> nums) {		//=> burada List'in basindan Array i sildik, bir ustteki calismayinca
		
		for(Integer n : nums) {
			System.out.print(n + " ");						// => burayi da sonradan print yaptik, ln sildik.
		}
		System.out.println();	
		
	}
	
	public static double sumList(List<Double> dList ) {		// bastaki d buyuk de yazilabilir kucuk de
		double sum = 0.0;
		for(double d: dList) {
			sum += d;
		}
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList();
		for(int w = 1; w <= size; w++) {
			newList.add(w);
		}
		return newList;
	}
		
	public static List<Integer> getRandomList(int size)	{
		Random r = new Random();							// objet of Random class
		List<Integer> randomNums = new ArrayList<>();
		for(int i = 0; i <= size; i++) {
			randomNums.add(r.nextInt(101));				// always start 0' dan 101 
		}
		return randomNums;
	}
		
	public static List<Integer> convertToIntList(List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for(String str : strList) {
			newList.add(Integer.parseInt(str));
		}
		return newList;
	}
	

	
}
