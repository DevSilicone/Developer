package day48_inheritance01;

//Employee IS-A    Person
public class X04_Employee extends X01_Person{

	String jobTitle;
	
	
	public void work () {
		System.out.println(name + " is working as " + jobTitle);
	}


	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
