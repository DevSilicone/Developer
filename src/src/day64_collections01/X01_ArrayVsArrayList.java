package day64_collections01;
import java.util.*;
public class X01_ArrayVsArrayList {

	public static void main(String[] args) {

//		Arrays are fixes size
//		Arrays are duplicates
//		Keeps ordering
//		Allows primitives and object
		
		int[] numsArray = {30,50,5011, 30, 5, 5};
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		
		
//		ArrayList
		
		List<Integer> numsList = new ArrayList<>();				//=> polymorphic way
//		ArrayList<Integer> numsList = new ArrayList<>();		//=> without usin polymorphic way => regular way.		
		
		numsList.add(44);
		numsList.add(44);
		numsList.add(101);
		
		System.out.println(numsArray[0]);
		System.out.println(numsList.get(0));
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(numsList.toString());
	}

}
