package day41_customclasses02;

public class X02_Car {

	/* Custom Class Car
	 * instance variable/ attributes/ properties/ data:
	 * make
	 * model
	 * currentSpeed
	 * color
	 * */
	
	String make;
	String model;
	int currentSpeed;
	String color;
	
	

	/*
	 * printCarInfo()
	 * "car make[make], model[model], color[color],
	 * currentSpeed[currentSpeed]'
	 * */
	
	// bu yontemlerden bir tanesi
	public void printCarInfo() {
		String info = "Car make["+make+"], model [" + model +"], color["+color+"], currentSpeed["+currentSpeed+"]";
		
		System.out.println(info);
	}
	
	/*
	 * showCurrentSpeed
	 * return : void
	 * param  : int speedLimit
	 * "Ford is driving at currentSpeed mph, following speed limit"
	 * limit - 55
	 * "Ford is driving at currentSpeed mph, over the speed limit"
	 * speed limit - 55
	 * */
	
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " +  currentSpeed + " mph, following the speed limit - " + speedLimit );
		}else {
			System.out.println(make + " is driving at " +  currentSpeed + " mph, following the speed limit - " + speedLimit );
		}
		
	}
	
	/*
	 * drive
	 * 		Ford Mustang is driving
	 * */
	
	public void drive() {
		System.out.println(make + " " + model + " is driving ...");
	}
	
	/*
	 * accelerate
	 * return type: void
	 * params : int mph
	 * increase current speed by value of mph
	 * accelerate(10);
	 * 55 => 65
	 * */
	public void accelerate(int mph) {
		currentSpeed = currentSpeed + mph; // currentSpeed +=mph => hizi artirmak icin bunu uyguluyoruz
	}
}
