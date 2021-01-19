package day27_arrays04;

import java.util.Arrays;

public class ArrayPractice2 {

	public static void main(String[] args) {
		
		/* Canvas Courses */ 
		
		
					//  1    2       3      -   4   - 5       ==> 5 items (//) orada yazdirinca bosluk ciktigi icin o da sayiliyor 
		String url = "https://learn.java.com/courses/149";
		
		//split by / and store into array
		String[] urlArr = url.split("/");
		System.out.println(Arrays.toString(urlArr));	//==> gerek yoktu ama kac item oldugunu print etmek icin yazildi.
		System.out.println("Length: " + urlArr.length);
			
//***********************************************************************************************************************************		
		
		//get last number and convert to int data type
		System.out.println(urlArr[urlArr.length -1]);
		
		int courseID = Integer.parseInt(urlArr[4]);  //==> [urlArr.length -1] yerine [4] de yazilabilir. 5 -1 ve 4 old icin. ama tercih edilen uzun olani

		
//*************************************************************************************************************************************		
		
		// use switch statement to find course name
		
		switch(courseID) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Welcome Kit");
			break;
		case 143:
			break;
		default:													//==> meaning (else)
				System.out.println("Invalid number for the course");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
