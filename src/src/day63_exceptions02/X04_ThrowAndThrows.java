package day63_exceptions02;

import java.io.*;

public class X04_ThrowAndThrows {

	public static void main(String[] args) {
		
		System.out.println("hello World");
//		throw new RuntimeException("This is thrown using throw keyword");

		String username = "user01";						// ""
		if(username.isEmpty()) {
			throw new RuntimeException("UserName cannot be empty");
		}else {
			System.out.println("Valid username");
		}
		
		
		// throwing checked exception
		// handle - declare . otherwise it will not compile
		try {
			throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		
		try {
		sleep(2);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		

	}
		
		// main method end
		// declare using throws keyword
		public static void sleep(int seconds) throws InterruptedException {
			Thread.sleep(seconds*1000);
		}
		
	
}
