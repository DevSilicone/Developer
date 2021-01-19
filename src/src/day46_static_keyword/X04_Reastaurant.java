package day46_static_keyword;

public class X04_Reastaurant {

	public static void main(String[] args) {
		
		X03_Dinner Mom = new X03_Dinner();
		X03_Dinner kid = new X03_Dinner();
		X03_Dinner dad = new X03_Dinner();
		
		System.out.println("Total slices: " + X03_Dinner.pizzaSlices);
		
		dad.takeASlice();	//7
		kid.takeASlice();	//6
		Mom.takeASlice();	//5
		
		System.out.println("Total slices: " + X03_Dinner.pizzaSlices);	//5
		System.out.println("Total slices: " + dad.pizzaSlices); //5	// basa donuyor ve 5 kaliyor
		
		kid.takeASlice(3);	//2
		dad.takeASlice(2);	//0
		//Mom.takeASlice(); -1 kaldi cikardik ve sonuc dogru olarak 0 gosterdi simmdi.
		
		System.out.println("Total slices: " + Mom.pizzaSlices); 	// -1 gosteriyor //0
		System.out.println("Total slices: " + X03_Dinner.pizzaSlices);	// 0
		
	}

}
