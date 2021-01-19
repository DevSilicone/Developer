package day27_arrays04;

import java.util.*;

public class ArrayPractice7 {

	public static void main(String[] args) {
		
		// ### Copy of ###
		
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 = d1;
		
	/*	System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 1000.3;
		
		System.out.println(Arrays.toString(d1));	===> bu uc yontem surekli kopyaladigin icin ileride bir degisiklik yapginda hepsi etkilenir.
		System.out.println(Arrays.toString(d2));	===> o yuzden ekili bir cozum degil.
		
		d2[1] = 4000.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2)); */
		

		double[] d3 = Arrays.copyOf(d2,  d2.length); // ==> ayrica bir copyOf yaptigin zaman, {2.3, 4.5, 12.4} bunlari tekrar yazdirdigi icin
													 // ==> kopya uzarine degisiklik yapmis olur ve illk olan asil ilk degerlerde degisiklik olmaz.
		System.out.println("D3: "+ Arrays.toString(d3));
		
		d2[0] = 1;
		System.out.println("D3: "+ Arrays.toString(d2));
		
		
		
		
	}

}
