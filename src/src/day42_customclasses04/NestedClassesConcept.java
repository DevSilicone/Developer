package day42_customclasses04;

//private olmasi icin clasin nested olmasi, baska bir class icerisinde olmasi gerekir.	

class OuterClass{
	
	// inner - nested
	int num;
	
	private class InnerClass{
		void print() {
			System.out.println("This is inner class");
		}
	}
	
	void displayInner(){
		InnerClass innerClass = new InnerClass();
		innerClass.print();
	}
	
}




public class NestedClassesConcept {
	
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		outerClass.displayInner();
		
	}
}
