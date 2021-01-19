package day18_while_loop;

import java.util.Scanner;

public class WhileLoopp11_EnterPincode2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		int pincode = 0;
		int attempts = 0; // 1 olmasinin sebebi saymaya sifirdan basliyor, biz 3 yazdik asagida o yuzden birden baslarsa uc kez olmus olacak
		
		// give only 3 attempts
		// if attempts reaches more than 3 print card blocked
		
		while (pincode != secretPincode) {
			System.out.println("enter pincode");
			pincode = input.nextInt();
			
			attempts++;

		if(attempts == 3 && pincode != secretPincode) {
			System.out.println("Card is blocked");
			return;									// stop execution ( uygulama, yurutme) durdur.
			}
		}
		
		System.out.println("access granted. Select operation");

	}

}
