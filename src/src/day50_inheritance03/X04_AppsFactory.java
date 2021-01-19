package day50_inheritance03;

public class X04_AppsFactory {
	
	public static void main (String[] args) {
		
		X02_IphoneApp iApp = new X02_IphoneApp();
		X02_IphoneApp iApp2 = new X02_IphoneApp("Uber");

		X03_AndroidApp andrApp = new X03_AndroidApp();
		X03_AndroidApp andrApp2 = new X03_AndroidApp("Lyft ");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(andrApp.getName());
		System.out.println(andrApp2.getName());
		
System.out.println("*************************************************");

		// bunlar da static olanlari buraya alma super class'tan
		// INHERITED, cuku app class da olanlara direk ulasabiliyoruz vve sub(buray) alabiliyoruz.
		
		//###################################
		// STATIC METHOD (can only use (static, other static, variables or methods)
		// static variable, can not use non-static variables ve non static method

		X01_App.count = 33;								
		System.out.println(X02_IphoneApp.count);
		
		X03_AndroidApp.count = 100;					// burada deger degistirirsen butun sub classlarda degisir - static method
		
		System.out.println("App.count: " + X01_App.count);
		System.out.println("App.count: " + X02_IphoneApp.count);
		System.out.println("App.count: " + X03_AndroidApp.count);
		

		System.out.println("*************************************************");		
		
		// AS LONG AS ACCES MODIFIER ALLOWS IT. IT'S FINE
		// hepsi calisir - PUBLIC - STATIC - INHERITED cunku
		X01_App.build("Swift");
		X02_IphoneApp.build("Objective C");
		X03_AndroidApp.build("Java");
		andrApp2.build("J");
		
		
		
		
	}
}
