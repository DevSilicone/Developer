package day51_super_overriding_vs_overloading_04;

public class X03_Swimming extends X01_Exercise{
	
	
	@Override
	public int perform (int minutes) {
		System.out.println("Swimming");
		return minutes * 11;
	
	
	}
}