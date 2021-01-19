package day50_inheritance03;

public class X01_App {

	/*
	 * encapsulated name
	 * one-arg constructor
	 * 
	 * */
	
	private String name;
	public static int count;		// sonradan ekledik, INHERITED, super classtan - SUB CLASS'a ornek olsun diye
	
	
	
	public X01_App(String name) {
		this.name = name;
	}
	
	public static void build(String language) {	// sonradan ekledik
		System.out.println("Building an app using: " + language);
	}
	
	
	
	
	// GETTER - SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
