package day51_super_overriding_vs_overloading_04;

public class X06_Sprinting extends X02_Running {

	
	// RUNNING sub class ( when a subclass overrides a method, and the overriden version will be inherited to other sub classes of its own
	@Override
	public int perform (int minutes) {
		System.out.println("Running");
		return minutes * 10;
	}
	
	
}
