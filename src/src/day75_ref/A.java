package day75_ref;

import java.util.Scanner;

class A {


	 public static void main(String... yavuz) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		B obj = new B(a);
		
		System.out.println(obj.a);
		
		obj.addNumber();
		
		System.out.println("Hello");
		
		
		
		

	}
	

}


class B{
	
	int a;
	
	public void addNumber(){
		int a = 5;
		int b = 10;
		
		System.out.println("sum of the number : " + (a+b));
	}
	
	
	
	B(int a){
	  
	}
	
	
}










