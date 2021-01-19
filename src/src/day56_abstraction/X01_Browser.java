package day56_abstraction;

public abstract class X01_Browser {

	String name;
	static int id;
	
	// abstract double price;						//=> you can't do that
	
	
	public X01_Browser() {
		System.out.println("Creatng a Browser");
		this.name = name;
		this.id = id;
		
	}
	
	public X01_Browser(String name, int id) {
		
	}
	
	
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	
	
	
	public void close() {
		System.out.println("Exitting the browser");
	}
	

}
