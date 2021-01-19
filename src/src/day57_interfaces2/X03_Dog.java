package day57_interfaces2;

public class X03_Dog implements X01_Pet, X02_Callable {

	
	@Override
	public void respond() {
		System.out.println("Dog is responding wooof-wooof");
	}
	
	
	@Override
	public void keepAsPet() {
		// TODO Auto-generated method stub
		System.out.println("Dog is keeping in the house or outside");
		
	}

	
	
}
