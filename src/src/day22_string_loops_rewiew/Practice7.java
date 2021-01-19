package day22_string_loops_rewiew;

public class Practice7 {

	public static void main(String[] args) {
				
		String word = "including webpages, images";
				

		int count = 0;
				
		for(int i = 0; i < word.length()-1; i++) {
			String temp = word.substring(i, i+1);  // 2 letters
			System.out.println(temp);
			if(temp.equals("e")) {
				count++;
			}
		}
				
		// Count: 3
				
		System.out.println("Count: " + count);		

	}

}
