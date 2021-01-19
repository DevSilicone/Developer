package day24_arrays01;

public class Arrays2 {

	public static void main(String[] args) {
	
		
		// STRING EXAMPLE
		
		String[] names = new String[5];
		String[] names1 = {"Shaun", "Raman", "Vlad", "Bura", "Maria"};
		
		System.out.println(names1[4]);
		
		System.out.println("Number of items: " + names1.length);
		
		//##########################
		
		String[] countries = { "" };
		// double [] values =
		// ARRAY HAS FIXED SIZE
		countries[0] = "USA";
		// String name = null;
		
		// ############################
		
		String[] fruits = new String[] {"apple", "orange"};
		// for each loop stands for collections of data
		// we need specify data type, variable name: our collection of data
		// for each loop
		// or enchanced loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
	}

}
