package day43_constructors;

public class X04_MyPets {

	public static void main(String[] args) {
		
		X03_Pet pet1 = new X03_Pet("Dog", "Poohchi");
		X03_Pet pet2 = new X03_Pet("Cat", "Barsik");
		X03_Pet pet3 = new X03_Pet("Cat", "Mila");
		X03_Pet pet4 = new X03_Pet("Fish", "Purple");
		X03_Pet pet5 = new X03_Pet("Goat", "Kozlik");
		X03_Pet pet6 = new X03_Pet("Bird", "Minda | Chika");
		
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		pet6.speak();
		
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());
		System.out.println(pet6.toString());
		
	}

}
