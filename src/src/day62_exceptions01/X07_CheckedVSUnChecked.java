package day62_exceptions01;

import java.net.URL;

public class X07_CheckedVSUnChecked {

	public static void main(String[] args) {
		
		// checked exception - InterruptedException
		// HANDLE-OR-DECLARE
		try{
			System.out.println("Sleeping");
			Thread.sleep(2000);							//=> checked exception 
		}catch(InterruptedException e) {
			System.out.println("Thread is interrupted!");
		}
		System.out.println("Woke up");
		
		
//		try {
//		URL url = new URL("https://www.goodle");
//		System.out.println(url.toString());
//		}catch(MalformedURLException e) {
//			System.out.println("Invalid URL");
//		}
//	
	
	
	}

}
