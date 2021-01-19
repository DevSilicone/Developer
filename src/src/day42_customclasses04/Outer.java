package day42_customclasses04;

public class Outer {

	private int data = 30;
	
	
	// Local Inner -> diger class olusturma sekli --> method icerine class olusturma.
	void display() {
		
		class Local{
			
			void msg() {
				System.out.println("Data is : " + data);
			}
			
		}
		// Local Class finishes
		Local iLocal = new Local();
		iLocal.msg();
	}
	
	
	
	
	public static void main(String[] args) {
		
		new Outer().display();

	}

}
