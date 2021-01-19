package day43_constructors;

public class X02_MicroCenter {

	public static void main(String[] args) {
		
		X01_Computer comp1 = new X01_Computer();   //=> diger tarafa (computer) yazdigimizi bununla print ettik
		X01_Computer comp2 = new X01_Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
System.out.println("***********************************************");
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(2567);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windows 10");
		comp2.setPrice(1300);
		
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		X01_Computer comp3 = new X01_Computer("ASUS", "Windows 7", 645.5);
		System.out.println(comp3.toString());
		
		/* setter is updating, getter is reading**/
		
		
		// yukaridaki windows7 bu sekilde degistirebilir
		// setters help update data - burada kullandik
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
	
		
		//burada da setter kullandik, price degistik, ama get ile once okuttuk
		/* setter is updating, getter is reading**/
		comp3.setPrice(comp3.getPrice() - 200);
		System.out.println(comp3.toString());
		
	}
}
