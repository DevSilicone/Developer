package day55_abstraction3;

public class X02_Sailboat extends X01_Vehicle {
	
	private int length;

	public X02_Sailboat(double price,int length) {
		super(0, price, "Sailboat", "wind");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Sails... ");
	}


	public int getLength() {
		return length;
		
	}
	
	
	
		
	
	
	
	
	
}
