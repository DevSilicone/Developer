package day52_object_class_05_2;

public class X03_EqualsMethod {

	public static void main(String[] args) {
		
		X02_Computer comp1 = new X02_Computer("iMac", "silver");
		X02_Computer comp2 = new X02_Computer("iMac", "silver");
		
		X02_Computer comp3 = comp2;								// => point to same object
		
		System.out.println(comp1 == comp2);					// => ikisi ayni seyi mi point ediyor(HEAP AND STACK memoryi dusun)ikisi farkli seyleri gosteriyor. heap memoryde.
		System.out.println(comp1.equals(comp2));			// => enson eklemelerden sonra ayni data mi diye bakiyor o yuzden true
		
		
		System.out.println(comp3 == comp2);					// => they ara pointign to same object now(stack and heap memory dusun)
		System.out.println(comp3.equals(comp2));			// => ikisi ayni object'i gosterdigi icin simdi true oldu.
		
		System.out.println();
		
		String str1 = "java";
		String str2 = new String ("java");		
															// chechking only if str1 and str2 point to same object
		System.out.println(str1 == str2); 					// false
		
															// cehecking value in the str1 and str2
		System.out.println(str1.equals(str2));	 			// true		=> overriding in side the String - bu yzuden dogru
		
		
		
		
	//				### .EQUALS() method ###		
			

	
	
	}
}
