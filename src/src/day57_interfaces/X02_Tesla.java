package day57_interfaces;

public class X02_Tesla extends X05_Vehicle implements X01_Electric, X04_Automonous{

	public void charge() {
		System.out.println("Tesla is charging at charging station");
	}
	
	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode. Driving autonomously");
	}
	
}
