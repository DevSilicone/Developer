package day42_customclasses03;

public class X02_MyCoffees {

	public static void main(String[] args) {
		
		X01_Coffee coffee1 = new X01_Coffee ();
		coffee1.name = "ICED CARAMEL MACCHIATO";
		coffee1.size = "GRANDE";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		
		coffee1.getCoffeeInfo();

		
		
		X01_Coffee coffee2 = new X01_Coffee ();			// coffee3.name = "ICED COFFEE"; => setName ile ayni 
		coffee2.setName("JAVA CHEAP");			// setter methods/ setter data (diger class icin olusturdugumuz yerden geliyor
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
		
	
		X01_Coffee coffee3 = new X01_Coffee();
		coffee3.setName("ICED COFFEE");
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		System.out.println("coffee3 name: " + coffee3.name); // => set name ile ayni oldugu icin bunu da yazabiliriz.
		coffee3.getCoffeeInfo();
		
		X01_Coffee coffee4 = new X01_Coffee();
		coffee4.setCoffeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeeInfo();
		
		
		
	}

}
