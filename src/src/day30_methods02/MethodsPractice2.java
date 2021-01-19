package day30_methods02;

import java.util.*;

public class MethodsPractice2 {

	public static void main(String[] args) {
		
		introduce();
		introduce();
		
		
		
	}
		/*
		  method name: introduce()
		  params/args: nothing
		  return type: void
		  it will ask a name and say Nice to meet you
		 */ 

	public static void introduce() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.next();
		
		System.out.println("Nice to meet you, " + name + ".");
		
		
	}
}
