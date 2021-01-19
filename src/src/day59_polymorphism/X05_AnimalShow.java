package day59_polymorphism;

public class X05_AnimalShow {

	public static void main(String[] args) {
		
		X01_Animal animal = new X01_Animal();
		// Polymorphism: Reference Animal, object Tiger, Cheetah, Zebra
		X01_Animal tiger = new X04_Tiger();
		X01_Animal cheetah =new X03_Cheetah();
		X01_Animal someAnimal = new X02_Zebra();
		
		animal.talk();
		tiger.talk();
		cheetah.talk();
		someAnimal.talk();
		
		System.out.println();
		
		X01_Animal[] animals = new X01_Animal[3];
		animals[0] = new X04_Tiger();
		animals[1] = new X03_Cheetah ();
		animals[2] = new X02_Zebra();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
		
		
		
	}

}
