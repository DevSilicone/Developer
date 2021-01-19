package day46_static_keyword;

public class X02_Ebay {

	public static void main(String[] args) {
		
		X01_Customer cm1 = new X01_Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
		X01_Customer cm2 = new X01_Customer("ADILET KYRGYZ", "adilet@yahoo.com");
		X01_Customer cm3 = new X01_Customer("Anastisiia Zasibna", "Anastaisiia@outlook.com");
		
		System.out.println(cm3.count); 			// diger tarafa static koyunca 3 verior sonuc. bunun icin asgadakini ekliyoruz
		System.out.println(X01_Customer.count);
		
		X01_Customer cm4 = new X01_Customer("Bur cal", "bur@yahoo.com");
		System.out.println("Total Customers: " + X01_Customer.count);
		
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(X01_Customer.count);

		System.out.println(cm1.toString());
		System.out.println(cm2.toString());
		System.out.println(cm3.toString());
		System.out.println(cm4.toString());
		
	}

}
