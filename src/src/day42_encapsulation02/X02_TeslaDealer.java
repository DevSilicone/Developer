package day42_encapsulation02;

public class X02_TeslaDealer {

	public static void main(String[] args) {
		
		X01_Tesla tesla = new X01_Tesla();
		tesla.setModel("model Y");		// son eklemelerden sonra baska model yazarsak buraya Invalid olarak print ediyor
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		
		
		System.out.println("Model: " + tesla.getModel());
		System.out.println("range: " + tesla.getRange());
		System.out.println("0to60: " + tesla.getZeroTo60());
		System.out.println("price: " + tesla.getPrice());
		System.out.println("SelfeDriving: " + tesla.isSelfDriving()); // diger tarafa koydugumuz iz, buraya aliyoruz 
		
		
		System.out.println(tesla);				// automatically calling toString method
		
		System.out.println();
		
		System.out.println(tesla.toString());  // toString special is method in java. if you have object with a lot of different type of value. 
											  // toString convert it to string provide a disciription about the data.
	
//****************************************************************************************************************************	
		System.out.println();
		
		X01_Tesla myTesla = new X01_Tesla();
		
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
	
		//tesla, myTesla
		if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}
System.out.println("*********************************************************************************************************************");		
		// bu kisim asagidakiler uzerinde duzenlendi
		
		
		buy(myTesla);
		buy(tesla);
		
		System.out.println();
		
		testDrive("Model S", 350);
		System.out.println(testDrive("Model S", 350));		// model S print ettik
		
		X01_Tesla testCar = testDrive("Model 3", 350);
		System.out.println(testCar.toString());			// model 3 print ettik
		
		
System.out.println("************************************************************************************************************");		
		
	}  
	
	// main method
	
	/*
	 * testDrive
	 * return: Tesla
	 * param : model
	 * 
	 * "I would lik eto test drive - model"
	 * "Sure, let me build the object and return it"
	 * 
	 * create object with data here and return
	 * return car{Tesla object};
	 * */
	
	public static X01_Tesla testDrive(String model, int speed) {
		System.out.println("-Hi, I would like to test drive - " + model);
		System.out.println("-Sure, let me build object and return it, momentarily");
		
		X01_Tesla car = new X01_Tesla();
		car.setTeslaInfo(model, speed, 2.5 , 95000, false);
		
		return car;

	}		


	
	//this is main method//	// asagida yaptiklarimiz ustteki kisim olan main method kismini cagiriyor orada yapiyor.								   

	// METHODS THAT RETURN OR ACCEPT CUTOM CLASS TYPE
			// TESLA
			// in TeslaDealer class,
			// Static buy
			// return type : void
			// params : TEsla object
			// Purchasing + toString value"
	
					// car = myTesla car)
	public static void buy(X01_Tesla car1) {				// bu durumda custom method call our cutsom method
		System.out.println("Purchasing: " + car1.toString());
	}
	
	
	/**
	 * When we write custom classes, we can use that class as METHOD PARAMS, OR METHOD RETURN VALUE
	 * 
	 * When we call that kind of method, we need to create object of the class first then return it.
	 * 
	 * Yukarinin aciklamasi
	 * */
	
	
	
	
	
	
}
