package day62_exceptions01;

public class X03_NullPointer {
	
	static String name;								//null
	
	public static void main(String[] args) {
	
		try {
			System.out.println(name.toUpperCase());
		}catch(NullPointerException e) {
			System.out.println("NullPointer Exception happened");
			System.out.println("Here is the Message: " + e.getMessage());
			System.out.println("Here is the stackTrace");
			e.printStackTrace();
		}
	
		
	}
}
