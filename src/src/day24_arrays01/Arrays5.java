package day24_arrays01;

public class Arrays5 {

	public static void main(String[] args) {

		// ### CITIES ###
		
		
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami", "Silver Spring", "McLean"};
		
		System.out.println(cities.length); // cities toplam sayiyi veriyor
		
		// TASK print all cities that start with M
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
			
		}
		
		// same thing, with for each loop
		for (String city: cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
		
		
		
		
	}

}
