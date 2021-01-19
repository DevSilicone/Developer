package day50_overriding03_2;

public class X04_Company {

	public static void main(String[] args) {
		
		X01_Employee emp = new X01_Employee();
		X02_FullTimeEmployee ft = new X02_FullTimeEmployee();
		X03_Contractor ct = new X03_Contractor();
		
		emp.calculatePay(40, 40);					// bunlar kendi sub-classinda print oluyor -> INHERITENT place gidip run etmi ol.
		ft.calculatePay(40, 45);					// sub class olarak gelenlerde, kendi classina gidip run ediyor
		ct.calculatePay(40, 55);
		

	}

}
