package day41_customclasses02;

public class X03_MyCars {

	public static void main(String[] args) {
		
		// buradaki verilerin hepsini diger class olan "Car" dan alip burada yazdiriyoruz.
		
		X02_Car car1 = new X02_Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();							// bu burada olmak zorunda. yoksa calismaz. yukari koyarsak null cikar.
		
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		car1.drive();
		System.out.println("before : " + car1.currentSpeed);
		
		
		car1.accelerate(20);
		System.out.println("after : " + car1.currentSpeed);
		
		
		// ### BMW class'dan aldik
		X04_BMW bmw = new X04_BMW();
		
		System.out.println(bmw.make);
		
		bmw.model = "740i";
		
		bmw.showPrice();
		
		System.out.println("Car Price: " + bmw.price);
		
		X04_BMW bmw2 = new X04_BMW();							// diger class da listemizde olmadigi icin model is not availible diyor
		
		bmw2.model = "X3";
		bmw2.showPrice();
		
		
	}
}
