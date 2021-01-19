package day43_constructors;


public class X01_Computer {
	
	/*
	 * Class computer
	 * brand
	 * os
	 * price
	 * 
	 * private
	 * getter/settter
	 * 
	 * */
	
	private String brand;
	private String os;
	private double price;
	
	
	
	//add a constructor								// istedigin kadar ihtiyacin oldgu kadar constructor ekleyebilirsin
	public X01_Computer() {
		System.out.println("Computer constructor...");
		brand = "unknown";
		os = "unknown"; 
		
	}
	
	
	public X01_Computer(String brand, String os, double price) {	// bu daha kullanisli
		System.out.println("In 3 args constructor...");
		this.brand = brand;
		this.os = os;
		this.price = price;
	}
	
	
	
	
	@Override
	public String toString() {
		return "X01_Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	
	
	
	
	// en kisa yolda b asagidakiler setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
