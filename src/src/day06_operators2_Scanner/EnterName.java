package day06_operators2_Scanner;

import java.util.Scanner;

public class EnterName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, What is your name?");
		
		String firstName = input.next(); // accept String input // next otomatik olarak string algiliyor.
		
		System.out.println("Nice to meet you, " + firstName);
		

	}

}
