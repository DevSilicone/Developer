package day51_super_overriding_vs_overloading_04;

public class X02_Running extends X01_Exercise {
	
	@Override
	public int perform (int minutes) {
		System.out.println("Running");
		return minutes * 10;
	}

}
