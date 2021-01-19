package day49_inheritance02_3;

import day49_inheritance02_2.X01_Device;


		   //Non-Sub class in different package - diger paketteki class ile bir bagi yok - normal class - deneme
public class X01_OverSeasFactory {

	public static void main(String[] args) {
		
		X01_Device dv = new X01_Device();
		
		dv.brand = "Samsung";
		
		// dv.model = "3200";  => model is not visible (diger package'in - sub class'i degil) bunu alamiyoruz buraya.
		
		// dv.price = 1000; => not VISIBLE - NOT INHERETED - bunu da diger paketten almaya calistik ama DEFAULT value oldugu icin calismiyor baska pac.
		
		// dv.country = "El Salvador";	=> not VISIBLE - not INHERETED private oldugu icin diger packageden buraya gelmiyor ve calismiyor.

	}

}
