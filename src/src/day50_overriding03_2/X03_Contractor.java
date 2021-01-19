package day50_overriding03_2;

public class X03_Contractor extends X01_Employee {
	
	@Override
	public void calculatePay(int hours, double rate) {
		double total = hours * rate + 200;							// $200 ekledik
		 System.out.println("Contractor total pay: " + (hours * rate));
	 }
	
}
