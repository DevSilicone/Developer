package day33_methods05;

public class MethodsPractice4 {

	public static void main(String[] args) {
		
		// ### Pay Calculator ###
		
		
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay);
		
		System.out.println("*********************************************************************");
		
		System.out.println(getHourlyPay(0,10));
		
		System.out.println("**********************************************************************");
		int noPay = getHourlyPay(10,0);
		System.out.println("noPay: " + noPay);
				
		
		
	}
	
		/**method: getHourlypay
		return type: int
		params : int hours, int rate
		return total pay by multiplying hours * rate
		
		if hours is 0 or negative
			print"Invalid hours"
			return 0;
	
		if rate is 0 or negative
			print "Invalid rate"
			return 0;
		**/
	
	public static int getHourlyPay(int hours, int rate) {
		//negative checks
		if(hours <= 0) {
			System.out.println("INVALID HOURS!");
			return 0;
		}
		// negatif checks
		if(rate <= 0) {
			System.out.println("INVALID RATE!");
			return 0;
		}
		
		int totalPay = hours * rate;
		return totalPay;
		// System.out.println("END OF METHOD"); => when return statement line runs, code will exit the method at that point and whatever below will not run and unreachable

	}
		


}
