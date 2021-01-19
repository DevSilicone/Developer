package day55_abstraction;

public class X02_Cat extends X06_Mammal{
	

	public X02_Cat(String name) {
		super(name);
		
	}


	@Override
	public void speak() {
		System.out.println("meoooooooow...");
	}
	
	
	@Override
	public void eat() {
		System.out.println(getName()+ " eats");
	}

	@Override
	public void produceAMilk() {
		
	}
	
	
	
}
