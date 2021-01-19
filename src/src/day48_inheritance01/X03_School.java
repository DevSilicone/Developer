package day48_inheritance01;

public class X03_School {

	public static void main(String[] args) {
		
		X01_Person person = new X01_Person();
		
		X02_Student student = new X02_Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender='m';
		
		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';
		
		person.eat("Steak");
		student.eat("grechka"); 
		
		person.walk();
		student.walk();
		
		person.sleep(8);
		student.sleep(7);
		
		
		student.clazz = "Ping pong";
		
		
		X02_Student student2 = new X02_Student();
		
		student2.name ="Orhan";
		student2.age = 49;
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.clazz = "Agile scram master";
		
		student2.code("java");
		student2.attendClass();
		student2.eat("kebab");
		student2.walk();
		
		student.code("phyton");
		student.attendClass();
		

	}

}
