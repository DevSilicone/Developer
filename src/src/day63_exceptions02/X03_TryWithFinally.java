package day63_exceptions02;

public class X03_TryWithFinally {

	public static void main(String[] args) {
		
		// Don't use it in real coding
		try {
			System.out.println("In Try block");
			System.out.println(10/2);
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println("After try finally");
		

	}

}
