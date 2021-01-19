package day62_exceptions01;

public class X04_TryCatchFinally {

	public static void main(String[] args) {
		
		String str = "selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
			System.out.println();
		}catch(Exception e) {
			System.out.println("Enter correct index");
//			System.exit(0); 							//=> eger bu burada olursa finally block calismaz. => finally blogun calismadigi ilk durum bu
		}finally {										//=> finally will always run 					   => digeri de JVM crash
			System.out.println("Finally block");
		}

		System.out.println("AFTER TRY CATCH FINALLY");
		
	}

}
