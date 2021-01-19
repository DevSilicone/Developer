package day16_strings_substring;

public class PutWordInBetween {

	public static void main(String[] args) {
		
		String chars = "<<>>";
		
		String word = "va";
		
		
		String result = chars.substring(0,2) + word;
		System.out.println(result);

		String result1 = chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result1);
		
		
		

		
	}

}
