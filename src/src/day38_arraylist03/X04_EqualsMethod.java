package day38_arraylist03;

import java.util.*;

public class X04_EqualsMethod {

	public static void main(String[] args) {
	
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Yavuz");
		friends1.add("Selim");
		friends1.add("Ozturk");
		
		
												// everything must match
		
		friends2.add("Selim");					// harfi kucuk yaparsak da false olur. 
		friends2.add("Ozturk");
		friends2.add("Yavuz");					// simdi esit olmuyor
		
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same Friends");
		}else {
			System.out.println("Different Friends");
		}
		
	}
}
