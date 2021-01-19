package day50_overriding03_1;

public class X05_TestAnimals {

	public static void main(String[] args) {
		
		//Butun SUB-CLASS ve SUPERCLASS ayni
		
		
		X01_Animal an = new X01_Animal();
		X02_Cat cat = new X02_Cat();
		X03_Dog dog = new X03_Dog();
		X04_Duck duck = new X04_Duck();
		
		System.out.println();
		
		an.speak();			// buranin hepsi OVERRIDING
		cat.speak();
		dog.speak();		
		duck.speak();
		
		System.out.println();
		
		an.move(20);		// buranin hepsi overriding
		cat.move(201);
		dog.move(204);
		duck.move(208);
		
		
		

	}

}
