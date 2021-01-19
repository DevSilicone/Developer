package day51_super_overriding_vs_overloading_04;

public class X04_Yoga extends X01_Exercise{
	
	@Override
	public int perform (int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	
	}
}
