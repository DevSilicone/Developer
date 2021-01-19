package day24_arrays01;

public class Arrays8 {

	public static void main(String[] args) {
		
		// #### Split Sentence #### cumleyi kelimelere ayirma

		String sentence = "Java is a general-purpose programming language that is class-based, "
						+ "object-oriented, and designed to have as few implementation dependencies as possible.";
		
		String[] words = sentence.split(" ");
		
		
		for(String str: words) {
			System.out.println(str);
		}
		System.out.println(words[0]);
		
		System.out.println("**************");
		
		int counter = 0;
		
		for(String str: words) {
			if(str.equals("language")) {
				break;
			}
			counter++ ;
		}
		
		System.out.println("Position: " + counter);
		System.out.println(words[counter]);
		
		
		
		
		
		
		
		
		
	}

}
