package day57_interfaces2;

import java.awt.List;
import java.util.ArrayList;

public class X06_InterfaceTest {

	public static void main(String[] args) {
		

		X01_Pet cat = new X05_Cat();
		cat.keepAsPet();
		cat.play();
		
		X01_Pet.feed("dry food");
		System.out.println(X01_Pet.FRIENDLY);
		
		
		
	}

}
