package day12_switch_ternary;

import java.util.Scanner;

public class SwitchWeather {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How is the weather today?");
		String weather = input.next().toLowerCase();
		
	
		switch (weather) {
			case "sunny":
				System.out.println("Go to Park");
				System.out.println("Code Java");
				break;
			case "hot":
				System.out.println("Go Swimming");
				System.out.println("Code Java");
				break;
			case "windy":
				System.out.println("Fly a kite");
				System.out.println("Code Java");
				break;
			case "rainy":
				System.out.println("Go shopping");
				System.out.println("Code Java");
				break;
			case "snow":
				System.out.println("Chain your tyres");
				System.out.println("Go skiing");
				System.out.println("Code java");
				break;
			default:
				System.out.println("Code Java in any other weather");
		}
		
		System.out.println("### END OF PROGRAM ###");
	}

}
