package day06_operators2_Scanner;

public class MinutesToHours {

	public static void main(String[] args) {
		// Declare a int variable minutes
		// Using arithmetic operators, find out how many hours and remaining minutes are there
		// hours , remainingMinutes
		// print "5 hours and 10 minutes
		//========================================
		
		int minutes = 135;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		
		System.out.println("");
		
		int minutes1 = 120;
		int hours1 = minutes1 / 60;
		int remainingMinutes1 = minutes1 % 60;
		
		System.out.println(hours1);
		System.out.println(remainingMinutes1);
		
		System.out.println("");
		
		//=========================================
		// print "5 hours and 10 minutes
		System.out.print(minutes+" minutes is ");			// print yazdigimiz zaman ayni line da oluyor
		System.out.println(hours + " hours and " +remainingMinutes+" minutes");
		
		
		

	}

}
