package day16_strings_substring;

public class ReplaceThem {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		//replace , with !!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		
		String mixed = "&^@#$j$a-v|a@#$";
		//clean up mixed
		mixed = mixed.replace("&^@#$", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		System.out.println(mixed);
		// or
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");  //## chaning ###
		System.out.println(mixed);
		// or
		mixed = mixed.replace("a", "");
		System.out.println(mixed);
		
		//==========================================
		System.out.println();
		//==========================================
		
		
		String result = "About 115,000,000 results (0.59 seconds)";
		//using strings methods (replace, substring) get number of results
		
		result = result.replace("About ", "");
		//result = result.replace(" results (0.66 seconds)", ""); might break when number changes
		result = result.substring(0, result.indexOf(" "));
		
		System.out.println(result);
		
		result = result.replaceFirst(",", "_");  //?replace first comma
		System.out.println(result);
		
		
	}

}
