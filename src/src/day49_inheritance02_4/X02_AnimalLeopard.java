package day49_inheritance02_4;

public class X02_AnimalLeopard  extends X01_Animal{

	
	public X02_AnimalLeopard() {
		super();									// CALL PARENT CLASS no-args CONSTRUCTOR
		System.out.println("Leopard constructor");
		setType("Leopard");
		
	}
	
	
	public X02_AnimalLeopard(String type) {
		super(type); // call Animal(String type) constructor	// diger tarafa ikinci kiydugumuzu da buraya super ile aldik
		System.out.println("Leopard one arg-constructor");
	}
	
	
	
}
