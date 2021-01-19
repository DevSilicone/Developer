package day42_customclasses04;


class OuterClass1{
	
	int x = 10;
	
	class InnerClass{
		int y = 5;
		
		void print() {
			System.out.println(x);
		}
	}
	
	void print() {
		System.out.println(x);      // x'e ulasabiliyoruz ama y'e ulasmak icin object create etmemiz gerek
		
		InnerClass innreClass = new InnerClass();
		System.out.println(innreClass.y);
	}
	
	
}




public class NestedClassConcept2 {

	public static void main(String[] args) {
		
		OuterClass1 myOuterClass1 = new OuterClass1();
		OuterClass1.InnerClass myInnerClass = myOuterClass1.new InnerClass();		// => bu da inner class object create etmek icin, yontem bu
		// nested interface anlamina da gelir
		
	}

}
