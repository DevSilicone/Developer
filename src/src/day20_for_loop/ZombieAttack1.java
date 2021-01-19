package day20_for_loop;

import java.util.*;

public class ZombieAttack1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt(); // UNDERSCORE work for java to easy read
		
		int day = 0;
		
		while(inhabitants > 0) {
			System.out.println("Day " + day + " [" + inhabitants + "]");
			day++;  // add 1 to day
			inhabitants = inhabitants / 2; // decrease by half
		}
		
		System.out.println("----- EXTINCT ------ ");

	}

}
