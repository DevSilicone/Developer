package day47_blocks;

import static day47_blocks.X02_TestData.*;

import java.time.LocalDateTime;	// bu bilgisayardan otamatik okuyor

public class X04_BriteERP {

	
	
	static {	// automatically runs in the beginning.
		 System.out.println("Launch Browser ");
		 System.out.println("Navigate to: " + url);				// eger yukariya import yaparsak TESTDATA yi. yazmasak da print olur.
		 														// asagidaki orneklerde var ama bunda yok. yine de calisir
	}
	
	// outside olmasi lazim blok kurmak icin
	public static void enterEmail() {
		System.out.println("Enter email: " + X02_TestData.email);
	}
	
	public static void enterPassword() {
		System.out.println("Enter password: " + X02_TestData.password);
	}
	
	public static void verifyLogin() {
		System.out.println("Expected Name: " + X02_TestData.userName);
		System.out.println("Actual Name displayed: Viktoriia Lugovska");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
	
	
	
	/// enter yaptiktan sonra, click the button testini unuttuk burada
	
	
	
}
