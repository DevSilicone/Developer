package day47_blocks;

public class X09_AllBlocks {
	
	int nonStaticInt = 10;
	static int staticInt = 10;
	
	
	static {
		System.out.println("static block - I run firts and only once");
		staticInt--;
	}
	
	
	{
		System.out.println("INIT BLOCK - I run each time object is created. before constructor");
		nonStaticInt += 5;
		staticInt += 5;
	}
	
	public X09_AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created. after INIT BLOCK");
		nonStaticInt += 3;
		staticInt += 3;
	}
	

}
