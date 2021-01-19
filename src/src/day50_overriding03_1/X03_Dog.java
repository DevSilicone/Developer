package day50_overriding03_1;

public class X03_Dog extends X01_Animal {
	
	public void speak() {
		System.out.println("Dog is saying woof wooof");
	}

	public void move(int steps) {
		System.out.println("Dog is moving " + steps + " steps ");
	}


}
