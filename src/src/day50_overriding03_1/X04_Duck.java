package day50_overriding03_1;

public class X04_Duck extends X01_Animal{

	public void speak() {
		System.out.println("Duck is saying quwack quwack");
	}

	public void move(int steps) {
		System.out.println("Duck is moving " + steps + " steps ");
	}
	
}
