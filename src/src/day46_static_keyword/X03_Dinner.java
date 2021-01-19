package day46_static_keyword;

public class X03_Dinner {

	
	public static int pizzaSlices = 8;
	
	
	public void takeASlice() {
		pizzaSlices--;		
	}
	
	
	public void takeASlice(int count) {
		pizzaSlices -= count;
	}
	
	
	
	
}
