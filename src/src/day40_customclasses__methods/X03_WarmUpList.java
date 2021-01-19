package day40_customclasses__methods;

import java.util.ArrayList;

public class X03_WarmUpList {

	public static void main(String[] args) {
		
		// WarmUpList:
		
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		myList.add("Sun");
		
		String targetWord = "Sun";
		
		int count = countOccurences(myList, targetWord);
		
		if(count == 3) {
			System.out.println("Unit test Pass: + Count is 3.");
		}else {
			System.out.println("Unit Test FAIL: Count is " + count);
			System.out.println("Expected: 3");
			System.out.println("Actual: " + count);
		}
		
		
		
	}	
		/*
		 Methoda name:countOccurances
		 Return : int
		 Params : ArrayList<String>, String word
		 Method counts how many times, word appears in the list, and returns the count. case sensetive
		 * */
										  //[aa, aa, bb, jj, yy]		  aa
		public static int countOccurences(ArrayList<String> list, String word) {
			int count = 0;
			for(String str : list) {
				if(str.equals(word)) {
					count++;
				}
			}
			return count;
			
		
	}

		
		
}
