package day57_interfaces;

public class X06_InterfaceTests {

	public static void main(String[] args) {
		
		// Electric el = new electric();			=> cannot instantiate an interface
		X02_Tesla t = new X02_Tesla();
		X03_BMWi8 i8 = new X03_BMWi8();
		
		t.charge();
		i8.charge();
		
		t.drive();
		t.selfDrive();
		
		X01_Electric el2 = new X02_Tesla();					//=> this possible ( m=but its more polymorphism)
		
		
	
		
	}

}
