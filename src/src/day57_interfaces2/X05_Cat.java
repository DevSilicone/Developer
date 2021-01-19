package day57_interfaces2;

public class X05_Cat implements X01_Pet, X02_Callable{


	@Override
	public void respond() {
		System.out.println("Cat is respondign meoww meoww");
	}
	
	
	@Override
	public void keepAsPet() {
		// TODO Auto-generated method stub
		System.out.println("Cat is kept inside home");
		
	}

	
	
}
