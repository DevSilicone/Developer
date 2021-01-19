package day27_arrays04;

import java.util.*;

public class ArrayPractice9 {

	public static void main(String[] args) {
		
		// ### Copy Of 3 ####

		
		int[] brandNew = {34, 23, 54, 23};
		System.out.println("Length before: " + brandNew.length);
	
		brandNew = Arrays.copyOf(brandNew,  brandNew.length + 5);
		System.out.println("Length after: " + brandNew.length);
		
		// yeni actigimiz degere 5 tane daha ekledik


	}

}
