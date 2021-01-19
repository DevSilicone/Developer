package day51_super_overriding_vs_overloading_04;

public class X08_Snowboarding extends X01_Exercise {

											// eger super() olsaydi, super class'in constructor'ina ulasacaktik.
											// ama bu ulastigimiz yer constructor degil, o yuzden bu sekilde kullaniyoruz.
	public int perform(int minutes) {
		int cals = super.perform(10);					// sonradan ekledik. parent classa ulastik.// call super vlass version of perform
		System.out.println("Snowboarding for " + minutes + " minutes ");
		return minutes *7 + cals;
	}
	
	
	
}
