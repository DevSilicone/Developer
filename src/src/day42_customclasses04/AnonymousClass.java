package day42_customclasses04;

// Anonymus Class -> bu da diger son class ornegi
interface Iphone{
	void call();
	void close();
}




public class AnonymousClass {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone() {
			
			@Override
			public void call() {
				System.out.println("Hey Siri.");
				
			}
			
			public void close() {
				System.out.println("Bye.");
			}
		};

		iphone.call();
		iphone.close();
		
	}

}
