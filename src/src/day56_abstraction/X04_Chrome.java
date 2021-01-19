package day56_abstraction;

public class X04_Chrome extends X01_Browser{

	public X04_Chrome(String name, int id) {
		super(name, id);
	}
	
	
	

	//public abstract void navigate(String url);
	@Override
	public void navigate(String url) {
		System.out.println("Chrome - navigating to " + url);	
	}
	
	
	//public abstract void displayWebpage();
	@Override
	public void displayWebpage() {
		System.out.println("Chrome - displaing webpage ");
	}
	@Override
	//public abstract boolean launch();
	public boolean launch() {
		System.out.println("Chrome is launching");
		System.out.println("1 2 3");
		return true;
	}
	
	
	@Override														//=> bu super classta abstract method degil. override yapmamiza gerek yok ama denemek icin bu.
	public void close() {
		super.close();
		System.out.println("Exitting Chrome");
	}
	
	

	
	
}
