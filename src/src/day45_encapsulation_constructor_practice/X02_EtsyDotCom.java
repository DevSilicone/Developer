package day45_encapsulation_constructor_practice;

public class X02_EtsyDotCom {

	public static void main(String[] args) {
		
		X01_EtsyAccount acct1 = new X01_EtsyAccount();			// always empty costructur is good idea. bunu yapip ne oldugunu gormek icin
		System.out.println(acct1.toString());

		acct1.setEmail("pumev@mrmail.info");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");
	
		System.out.println(acct1.toString());
		
System.out.println("**************************************************");	

		X01_EtsyAccount acct2 = new X01_EtsyAccount();
		acct2.setEmail("helirevaroyalhos.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc12");
		
		System.out.println(acct2.toString());
	
System.out.println("**************************************************");

		X01_EtsyAccount acct3 = new X01_EtsyAccount("helireva@royalhost.info", "Helireva", "234");  // pasword yanlis girince bos birak dedik, diger tarafta.
		
		System.out.println(acct3.toString());
		
System.out.println("**************************************************");			
		
		X01_EtsyAccount acct4 = new X01_EtsyAccount("woodenSpoon@gmail", "WdSpoon");
		System.out.println(acct4.toString());
		
		final String pasword = "33ymrj ";
	}

}
