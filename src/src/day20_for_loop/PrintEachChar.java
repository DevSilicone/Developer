package day20_for_loop;

public class PrintEachChar {

	public static void main(String[] args) {
		
		String word = "Amazon";
		
		// using for loop, print each char one by one
		
		for(int i = 0; i < word.length(); i++) {  // length karakterleri RAKAMA cevirdi ve hesaplayacak bir artirarak
			System.out.println(word.charAt(i));	  // charAt rakam olan lengthleri belirtilen yerden itibaren HARF olarak yazdiracak
		}
		
		
		// using for loop, print only vowel (a, e, o, i, u)
		
		for(int i = 0; i < word.length(); i++) {			//==> 
			char letter = word.toLowerCase().charAt(i);		//==> case sensetive yapmak icin yeni bir deger atadik LETTER
			if(letter == 'a' || letter == 'o' ) {		//==> parantez icerisine bir kez daha alinip basina ! isareti konursa kelimedeki diger harfleri print..
				System.out.print(letter + ",");
			}
	
		}
			
		//using for loop print only consonant
		
		for(int i = 0; i < word.length(); i++) {			
			char letter = word.toLowerCase().charAt(i);		
			if(!(letter == 'a' || letter == 'o' )) {	//==> parantez icerisine bir kez daha alinip basina ! isareti konursa kelimedeki diger harfleri print eder
				System.out.print(letter + ",");
			}
	
		}
		
			
			
			
	}

}
