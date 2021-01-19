package day55_abstraction;

public class X04_Dog extends X01_Animal{
	

	
	public X04_Dog(String name) {
		super(name);
	}

	
	@Override
	public void speak(){
		System.out.println("woof woof");
	}

	@Override
	public void eat() {
		System.out.println(getName()+ " eats");
		
	}
	
}
