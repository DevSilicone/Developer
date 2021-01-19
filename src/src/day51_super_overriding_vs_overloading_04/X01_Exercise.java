package day51_super_overriding_vs_overloading_04;

public class X01_Exercise {
	
	public int perform(int minutes) {
		System.out.println("Performing general exercise");
		return minutes * 4; 
	}
}

//class Running extends Exercise {		=> multiple classes can be stored in same file, but only one of them needs to be PUBLIC,
//										=> and file name must match the public class	
//}