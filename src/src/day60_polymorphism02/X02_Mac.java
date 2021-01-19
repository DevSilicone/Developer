package day60_polymorphism02;

public class X02_Mac extends X01_AppleDevice {
	
	
	public String model = "Mac Computer";
	
	@Override
	public void use() {
		System.out.println("Mac | Computer | Code | Read book | Email");	
	}
	
	
	public void code() {
		System.out.println("Coding Java with Mac ");
	}
	
	

	
}
