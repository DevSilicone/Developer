package day63_exceptions02;

public class X01_MultiCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(0/0);								// tum ihtimalleri yesil yapip tekrar tekrar dene.
			String str = null;
			System.out.println(str.length());
			int[] n = {10, 4};
			System.out.println(n[2]);
		}catch(ArithmeticException e) {
			System.out.println("ARITHMETIC EXCEPTION HAPPENED");
		}catch(NullPointerException e) {
			System.out.println("NULLPOINTEREXCEPTION EXCEPTION HAPPENED");
		}catch(RuntimeException e) {
			System.out.println("RUNTIMEEXCEPTION EXCEPTION HAPPENED" + e.getClass());
		}
		

	}

}
