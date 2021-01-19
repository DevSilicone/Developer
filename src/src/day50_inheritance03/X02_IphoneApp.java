package day50_inheritance03;

public class X02_IphoneApp extends X01_App{	// explisit constructor -> kendin yazacaksin demek
	
	
	// 1 add a constructor
	// 2 call super constructor
	
	public X02_IphoneApp() {
		super("IPhone App - unknown");
	}
	
	public X02_IphoneApp(String name) {
		super(name);
	}
}
