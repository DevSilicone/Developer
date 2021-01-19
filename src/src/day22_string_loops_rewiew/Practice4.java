package day22_string_loops_rewiew;

public class Practice4 {

	public static void main(String[] args) {
	
		// ### CATS AND DOGS ###
		
		String str = "mycatyourcat";
	
		// count how many cats
				
		int cats = 0;
		
		for(int i = 0; i <= str.length()-3; i++) {
			System.out.println(str.substring(i, i+3));
			if(str.substring(i, i+3).equals("cat")) {
				cats++;
			}
		}
		
		System.out.println("Count: " + cats);
		
		
		
		
		
		
		
		
		
		
	}

}
