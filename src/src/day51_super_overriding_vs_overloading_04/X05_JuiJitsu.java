package day51_super_overriding_vs_overloading_04;

public class X05_JuiJitsu extends X01_Exercise {

	@Override
	public int perform (int minutes) {
		System.out.println("JuiJitsu");
		return minutes * 12;
	}
}
