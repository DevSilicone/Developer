package day15_strings_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		
		String str ="javak";
		
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("v"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("k"));
		
		str.charAt(0);
		
		System.out.println((str.charAt(0) + "" + str.charAt(1) ));	//## EVERY TIME NUMBER BEHIND THE CARACTER  ### Look at the result
		
		
		//==================
		System.out.println();
		//==================
					  //012345
		String word1 = "github";
		
		System.out.println(word1.indexOf('g'));		//0
		System.out.println(word1.indexOf("th"));	//2
		System.out.println(word1.indexOf("hub"));	//3

		System.out.println(word1.indexOf("java"));	//-1  ################  its returning to -1 every time  #############
		
		//==================
		System.out.println();
		//==================
		
		str.charAt(0);
		
		System.out.println((str.charAt(0) + ""+ str.charAt(1) ));
		
		//==================
		System.out.println();
		//==================
		
					//0123
		String url = "www.okta.com";
		
		int i = url.indexOf(".");
		
		System.out.println("Pos of . :" + i);
		System.out.println(url.charAt(i+1)); // char gives a character "O"

		//==================
		System.out.println();
		//==================
		
		
		String title = "Java - Google Search";
		// find position of '-' and check if space
		// is on right and left sides 
		
		int dash = title.indexOf('-'); // 5 
		
		System.out.println(title.charAt(dash - 2)); // " "
		System.out.println(title.charAt(dash + 2)); // " "
		
		//==================
		System.out.println();
		//==================
		
		String country = "United States of America";
		int states = country.indexOf("States");	// 7
		System.out.println("Position of states: " +states);
		
		//==================
		System.out.println();
		//==================
		
		String word2 = "java, c++, python, tomcat, eclipse";
		// check if c++ is in the word2
		// 1)
		
		if (word2.contains("c++")) {					/// ### THIS IS BETTER TO READ
			System.out.println("c++ is here");
		}else {
			System.out.println("c++ is not there");
		}
		
		// using indexOf
		if(word2.indexOf("c++") > -1 ) {               /// #### IMPORTANT #### ALSO PASSIBLE 
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
	}

}
