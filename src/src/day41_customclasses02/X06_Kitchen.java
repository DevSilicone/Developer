package day41_customclasses02;

public class X06_Kitchen {
	
	public static void main(String[] args) {
		
		X05_Microwave mic = new X05_Microwave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza with mushrooms & anchovies");
		mic.turnOff();
		
	}
}
