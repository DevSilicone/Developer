package day59_polymorphism3;

import java.util.ArrayList;
import java.util.List;

public class X07_Store {

	public static void main(String[] args) {
		
		X06_HairSpray hp = new X06_HairSpray();
		hp.catchFire();
		
		X02_Flammable hairSp = new X06_HairSpray();
		hairSp.catchFire();
		
		// interface 		implementing class/sub class
		X02_Flammable pTank = new X05_PropaneTank();
		pTank.catchFire();
		
		X02_Flammable item;
		
		item = new X06_HairSpray();
		item.catchFire();
		
		item = new X05_PropaneTank();
		item.catchFire();
		
		
		List<X02_Flammable> items = new ArrayList<>();
		

	}

}
