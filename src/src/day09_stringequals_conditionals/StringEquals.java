package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {
		
		
		String str1 = "java";
		String str2 = "java";
		//using ==
		
		System.out.println(str1 == str2);   // true
		System.out.println(str1 == "java"); // true
		System.out.println(str2 == "Java"); // false
		
		// equals method. PREFERRED WAY
		
		System.out.println(str1.equals(str2));   // true
		System.out.println(str1.equals("java")); // true
		System.out.println(str2.equals("Java")); // false
		
		// String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2); // in the above line, Java is not doing values comparasion.
											 // it is just checking if month and month2 are pointing to same location in memory.
		
		System.out.println(month.equals(month2)); // always use .equals
		System.out.println(month.equals("March"));// always use .equals
		
		// In the above examples, by using equals method, java is checking if values are same. 
		// which is proper way of comparing strings.
		
	}

}
