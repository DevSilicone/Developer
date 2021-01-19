package day62_exceptions01;

public class X01_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		try {
		String str = "Java";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(1));
		}catch(Exception e) {
			System.out.println("Exception happened in try block and was caught ");
		}
		
		System.out.println("After try catch block");
	}

}
