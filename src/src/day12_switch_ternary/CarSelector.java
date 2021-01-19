package day12_switch_ternary;

import java.util.Scanner;

public class CarSelector {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which type of car are you interested in");
		
		System.out.println(" 1) American \n 2) Japanese \n 3) German \n 4) Italian\n 5) Korea");
		
		int carType = input.nextInt();
		
		double avaragePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		
		switch(carType) {
			case 1:
				avaragePrice = 33000.0;
				carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
				carOrigin = "American";
				break;
			case 2:
				avaragePrice = 32000.0;
				carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
				carOrigin = "Japanase";
				break;
			case 3:
				avaragePrice = 55000.0;
				carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
				carOrigin = "German";
				break;
			case 4:
				avaragePrice = 85000.0;
				carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
				carOrigin = "Italian";
				break;
			case 5:
				avaragePrice = 25000.0;
				carOptions = "Kia, Hyundai, Daewoo ";
				carOrigin = "Korean";
				break;
			default:
				System.out.println("Car type not available ");
				return; // stop execution. Dont run rest of code
		}
		
		System.out.println("You selected "+carOrigin+" car and your options are "+carOptions+".");
		System.out.println("Avarage Price: "+avaragePrice);
	}


}
