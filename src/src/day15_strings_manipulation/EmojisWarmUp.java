package day15_strings_manipulation;

public class EmojisWarmUp {

	public static void main(String[] args) {
		
		String emoji = ":)";
		
		//==, != (is not) CHECK IF IT NOT 2 CHARS
		
		if(emoji.length() != 2 ) {
			System.out.println("Invalid emoji");
			return; // stop execution
		}
		
	// ###################  ILK BOLUM ############################
		
		// if code reaches this point, then emoji is 2 chars
		// get first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if(second == ')') {
				System.out.println("smile");
			}else if(second == '(') {
			System.out.println("sad");
			}else if(second == '/') {
			System.out.println("upset");
			}else if(second == 'p') {
			System.out.println("playful");
			}else {
				System.out.println("Unknown emoji");
			}
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("wink");
			}else if(second == '0') {
				System.out.println("surprised");
			}else {
				System.out.println("Unknown emoji");					
			}
		}else if(first == '(') {
			if(second == ':') {
				System.out.println("smile");
			}else {
				System.out.println("Unknown emoji");
			}			
		}else if(first == ')') {
			}if(second == ':') {
				System.out.println("sad");
			}else {
				System.out.println("Unknown emoji");
			}
			
			System.out.println("Invalid emoji");
	}

}
