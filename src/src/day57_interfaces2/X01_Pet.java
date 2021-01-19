package day57_interfaces2;

public interface X01_Pet {

	public static final boolean FRIENDLY = true; //
	
	public abstract void keepAsPet();
	
	//public abstract void play();
	
	
	
	//java 8
	public default void play() {
		System.out.println("playing hide-and-seek with a pet");
	}
	
	//java 8	=> static methods in interface are not inherited to other classes.
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}
	
	
}
