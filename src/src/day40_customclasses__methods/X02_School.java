package day40_customclasses__methods;

public class X02_School {

	public static void main(String[] args) {
		
		// create object from student class 
		
		X01_Student student = new X01_Student();		// bunu diger class'da hazirladigimizi algilayarak, bu sayfada artik kullanabiliyoruz.
		
		student.name = "Yavuz";					
		student.age = 25;
		student.subject = "Java";
		
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("Subject: " + student.subject);
		
		
		X01_Student student2 = new X01_Student();	// => first create an object then is printing => sysout yapmayinca null gosterir. 
		
		System.out.println(student2.name);
		
		student2.name = "Cleetus";
		student2.age = 33;
		student2.subject = "Selenium";
		
		System.out.println("Name: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("Subject: " + student2.subject);
		
		
		System.out.println(student2.name);
		
	}

}
