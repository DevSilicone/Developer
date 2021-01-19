package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class X06_StaticImports {

	public static void main(String[] args) {
		
		System.out.println(PI); 				//pie
		System.out.println(max(10,5));
		System.out.println(max(10,10));
		System.out.println(min(10,100));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(round(15.5));		// 15.4 yazsak yuvarlamazdi
		System.out.println(round(15.49999));	// burada yuvarlamadi
		System.out.println(abs(-10));			// gercek deger cikarinca neyse onu gerei veriyor
		System.out.println(pow(10.4, 2));		// power (degeri kendi ile carpiyor)
		System.out.println(sqrt(5));			// ikiye boluyor gibi bir sey
		System.out.println(random());
		
		//=============================
		
		
		System.out.println(isDigit('4'));		// true
		System.out.println(isAlphabetic('J'));	// true
		
		//=============================
		
		int[] nums = {34, 23, 44, 11, 4444, 1222};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//=============================
		
		System.out.println(now());
	}
}
