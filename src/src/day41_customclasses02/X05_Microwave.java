package day41_customclasses02;

public class X05_Microwave {

	/**
	 * Microwave
	 * 
	 * brand
	 * isOn
	 * */
	
	String brand;
	boolean isOn;  //false. true => on, false => off
	
	
	
	/**
	 * Methods
	 * turnOn
	 * 		"Turning on the microvawe"
	 * 		if already on => "It is already on"
	 **/
	public void turnOn() {
		if(isOn) {
			System.out.println(brand + " microwave is already ON");
		}else {
			System.out.println("Turing on "+brand+" microwave");
			isOn = true;
		}
	}
	
	
	
	 /*
	 * turnOff
	 * 		"Turning Off the microvawe"
	 * 		if already off ==> "It is already off"
	 */
	public void turnOff() {
		if(isOn == false) {  //already OFF
			System.out.println(brand + " microvawe is already OFF");
		}else {
			System.out.println("Turing OFF "+brand+ " microwave");
			isOn = false;
		}
	}	
	
	
	 /*
	 * heat(food)
	 * 		if on => "Heating the pizza"
	 * 		if off => "Microwave is off, cannot heat pizza"
	 * */
	
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat" + food);
		}
	}	
}
