package day16_strings_substring;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter url:");
		
		String url = input.next();
		
		// check www.
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
		//check . is there before extension
		//find out the length of the url
		//do -4 and using charAt get the character
		//compare if it is '.'
		//www.etsy.com =>
		
		int dotIndex = url.length() - 4; // find the position for last '.'
		// url.lastIndexOf("."); // also find the position for list '.'
		System.out.println();
		
		
		if(url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");	
		}else {
			System.out.println(". might be misplaced");		
				}
		
		/*
		 * if(url.charAt(url.length() - 4) == '.' {
		 * }
		 */
		
		System.out.println();
		
		//get domain and extension
		//www.yahoo.com
		
		String domain = url.substring(4, dotIndex);  // substringden sonraki parantez belirledigimiz alani alip print ediyor.
		System.out.println("Domain: "+domain);
		
		// String extension=url.substring(dotIndex+1
		String extension=url.substring(dotIndex+1, url.length());  // substringden sonraki parantez belirledigimiz alani alip print ediyor.
																	// +1 OLMASININ SEBEBI'.' OLARAK BELIRLEDIGIMIZ dotIndex'ten sonra baslamasi icin
		System.out.println("Extension: " +extension);
		
		
		
		
	}

}
