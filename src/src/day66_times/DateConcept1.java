package day66_times;

// LOCAL DATE EXAMPLES
import java.time.LocalDate;

public class DateConcept1 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);

		System.out.println(LocalDate.now());
		
		
		System.out.println("Tomorrow's date :" + today.plusDays(1));		// birgun sonrasi icin bunu kullaniyoruz
		
		// find out yesterday's date
		System.out.println("Tomorrow's date :" + today.plusDays(-1));		// birgun oncesi icin
		System.out.println("Yesterday's date : " + today.minusDays(1));		// birgun oncesi icin
		
		// Date one week later
		System.out.println("One week later : " + today.plusWeeks(1));
		
		// Length of this year
		System.out.println(today.lengthOfYear());
	
		// yil icinde kac gun var
		System.out.printf("%s days in %s\n" , today.lengthOfYear(), today.getYear());
		
		
		
		
		
		
		int a = DateConcept1.method();				//=> bu sekilde method icerisinde int olarak da yapabiliriz.
		System.out.println(a);
		
	}
	
	static int method() {
		return 9; 
	}
	
}
