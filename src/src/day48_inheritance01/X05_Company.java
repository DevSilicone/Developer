package day48_inheritance01;

public class X05_Company {

	public static void main(String[] args) {
		
		X04_Employee emp1 = new X04_Employee();
		
		emp1.name = "Maria";
		emp1.jobTitle = "teacher";
		emp1.gender = 'm';
		emp1.age = 22;
		
		
		X04_Employee emp2 = new X04_Employee();
		emp2.name = "Keko";
		emp2.age = 26;
		emp2.gender = 'f';
		emp2.jobTitle = "HR";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("chicken kesadia");
		emp2.eat("salad");
		
		
		emp1.walk();
		emp2.walk();
		
		emp1.sleep(5);
		emp2.sleep(8);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
	}

}
