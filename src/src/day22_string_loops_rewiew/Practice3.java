package day22_string_loops_rewiew;

public class Practice3 {

	public static void main(String[] args) {
		
		// ## LOOK FOR WORD IN STRING ##
		
		String sentence = "He said hi, then she replied hi. hi guys!";
		
		// print letters in pairs
		// He
		//e
		// s
		//ai
		// check if temp equals "hi", if true, add 1 too loop
		int count = 0;
		
		for(int i = 0; i < sentence.length()-1; i++) {
			String temp = sentence.substring(i, i+2);  // 2 letters
			//System.out.println(temp);
			if(temp.equals("hi")) {
				count++;
			}
		}
		
		// Count: 3
		
		System.out.println("Count: " + count);
	}

}
