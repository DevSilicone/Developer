package day22_string_loops_rewiew;

public class Practice6 {

	public static void main(String[] args) {
		
		// ## FIND HOW MANY USING REPLACE #######
		
		String word = "including webpages, images";
		
		// find how many e characters in the world.
		// get the length of word
		// replace all e with empty
		// get the leg of word withour e
		// do a minus
		
		
		int length1 = word.length();
		
		word = word.replace("e", "");
		
		int length2 = word.length();
		
		int count = length1 - length2;
		System.out.println("Count of e: " + count);
		
		
		System.out.println("Length1: " + length1);
		System.out.println("Length2: " + length2);
		
		
		

	}

}
