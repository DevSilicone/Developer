package day43_constructors;

public class X03_Pet {

	/*
	 * ENCAPSULATED:
	 * 
	 * type
	 * name
	 * */
	
	private String type;
	private String name;
	
//	=======================================================	
	public X03_Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public X03_Pet() {
		System.out.println("No-args constructor");
	}
	
//	========================================================
	
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}

	
	
//	========================================================	
	public void speak() {
		switch(type.toLowerCase()) {
			case "cat":
				System.out.println("Myauu");
				break;
			case "dog":
				System.out.println("gav gav | woof woof | waw waw");
				break;
			case "bird":
				System.out.println("chik chirik");
				break;
			case "goat":
				System.out.println("mhaaaa mhaaaa");
				break;
			case "sheep":
				System.out.println("bhaaaa bhaaaa");
				break;
			case "rooster":
				System.out.println("u uruuuu uuuu");
				break;
			default:
				System.out.println(".... ");
		}
	}
	

	/*
	 * getter/ setter / toString
	 * 
	 * */
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
