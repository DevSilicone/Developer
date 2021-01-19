package day50_overriding03_2;

public class X02_FullTimeEmployee extends X01_Employee {
	
	
	
	@Override	// check if method is really overriden
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate) * 1.05;							// %5 hesaplarken bu sekilde yapiyorsun
		System.out.println("FullTimeEmployee total pay: " + total);
		 
	 }
	 
}
