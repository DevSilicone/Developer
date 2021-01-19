package day15_strings_manipulation;

import java.util.jar.Attributes.Name;

public class StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		//startsWith ==> tests if string starts with another string
		
		System.out.println(word1.startsWith("e"));	 //true
		System.out.println(word1.startsWith("ec"));	 //true
		System.out.println(word1.startsWith("ecli"));//true
		
		System.out.println(word1.startsWith("Ec")); //false
		
		System.out.println(word1.endsWith("e"));	//true
		System.out.println(word1.endsWith("ipse"));	//true
		System.out.println(word1.endsWith("java"));	//false
		
		
		//"PSE"					//ECLIPSE       //PSE
		System.out.println(word1.toUpperCase().endsWith("PSE")); //true
		
		System.out.println(word1.endsWith("eclipse")); // true // 100% match

		// ==========================================================
		
		//Mr. ===> man
		//Mrs.===> married woman 
		//Ms. ===> some women
		//Dr. ===> doctor man or woman
		//    ===> Unknown status
		
		String name = "Mr. Jackson";
		
		if(name.startsWith("Mr.")) {
				System.out.println("man");
			}else if(name.startsWith("Mrs")) {
				System.out.println("married woman"); 
			}else if(name.startsWith("Ms.")) {
				System.out.println("some woman");
			}else if(name.startsWith("Dr.")) {
				System.out.println("Doctor man or woman");
		}else {
				System.out.println("Unknown status");
		}
		
		
		
			
	}

}
