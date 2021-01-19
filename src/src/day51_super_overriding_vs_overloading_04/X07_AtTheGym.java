package day51_super_overriding_vs_overloading_04;

public class X07_AtTheGym {

	public static void main(String[] args) {
		
		X01_Exercise e = new X01_Exercise();
		X02_Running r = new X02_Running();
		X03_Swimming s = new X03_Swimming();
		X04_Yoga y = new X04_Yoga();
		X05_JuiJitsu j = new X05_JuiJitsu();
		X06_Sprinting sp = new X06_Sprinting();
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(40));
		System.out.println(s.perform(45));
		System.out.println(y.perform(60));
		System.out.println(j.perform(60));
		System.out.println(sp.perform(25));
		
		System.out.println("***************");
		
		X08_Snowboarding sn = new X08_Snowboarding();
		System.out.println(sn.perform(100));
		

	}
}
