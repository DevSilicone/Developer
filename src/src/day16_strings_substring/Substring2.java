package day16_strings_substring;

public class Substring2 {

	public static void main(String[] args) {
		
		// I wrote [236] lines of code today"
		// assign to variable and print the number [ and ]
		
		
		String sentence = "I wrote [33] lines of code today";
		
		int start = sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		
		String codeCount = sentence.substring(start, end);
		
		System.out.println("Lines of code: " + codeCount);
		
		System.out.println("Lines of code: "+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
		
		
		// Check if codeCount more than 20
		
		int count = Integer.parseInt(codeCount);  // convert String to int
		
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code Today!!!");
		}else {
			System.out.println("Not enough coding for today");
		}
		

	}

}
