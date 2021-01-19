package day55_abstraction;

public class X03_Zoo {

	public static void main(String[] args) {
//		Animal animal = new Animal();					=> Animal is an abstract class, we canNOT create an object of this class.
		X02_Cat fluffy = new X02_Cat("Fluffy");
		fluffy.speak();
		fluffy.eat();
		
		
		
		
		X04_Dog poohchi = new X04_Dog("rex");
		poohchi.setName("Poohchi");
		poohchi.speak();
		poohchi.eat();

		
		
	}
}
