package day17_stringpool_whileloop;

import java.util.Scanner;

public class SMSMessage {

	public static void main(String[] args) {
		
		//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter sender");
		String message = input.nextLine();
		
		
		
		
		String sender = message.substring( message.indexOf("<")+1 , message.indexOf(">"));
		System.out.println("Sender:" + sender);
		
		String phoneNumber = message.substring( message.indexOf("[")+1 , message.indexOf("]"));
		System.out.println("Phone number:" + phoneNumber);
		
		String messageBody = message.substring( message.indexOf("{")+1 , message.indexOf("}"));
		System.out.println("Message body: " + messageBody);

	}

}
