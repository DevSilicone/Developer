package day55_abstraction3;

public class X03_Bike extends X01_Vehicle {

	
	

	public X03_Bike(int wheels, double price) {
		super(wheels, price, "Bicycle", "a person");
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cycling");
	}

	
	
	
	
}
