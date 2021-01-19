package day49_inheritance02_2;

//TC is a child/sub class in the same package
public class X02_Tv extends X01_Device {

	public void watch() {
		
		System.out.println("Watching TV - " + brand + " model: " + model); // sona model ekledik PROTECTED calisiyor
		
		System.out.println("Price: " + price); 	// sonradan ekledik - calisiyor DEFAULT - ayni package -INHERETED
		
		// System.out.println("Made in " + country); => calismiyor - not visible -PRIVATE oldugu icin - NOT INHERETED
	}
	
}
