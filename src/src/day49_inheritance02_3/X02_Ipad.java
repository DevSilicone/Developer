package day49_inheritance02_3;

import day49_inheritance02_2.X01_Device;


//ZPIpad IS-A Subclass in a different package 
public class X02_Ipad extends X01_Device { 	// ZDevice clasina ulasip, bunu sub class yapmak icin
	
	
	public void readEBook(String title) {
		System.out.println("REading a book " + title + " using " + brand + " tablet ");
		
		System.out.println("Model - " + model);	// (INHERITED) aldigimiz class (PROTECTED) => Bu class da sub-class oldugu icin MODEL print edebiliyoruz
	
		// System.out.println("Price: " + price); // diger packageden aldik - it is not INHERITED - NOT VISIBLE
											   // DEFAULT oldugu icin bu package'ye ulasamiyor.
		
		
		// System.out.println("Made in: " + country); // not visible - not inherited - PRIVET ve bu packagede alismiyor, digerinden buraya gelmiyor
	
	}

}
