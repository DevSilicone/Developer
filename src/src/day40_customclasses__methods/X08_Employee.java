package day40_customclasses__methods;

public class X08_Employee {
	
	
	public String name;		// can be used anywhere in project
	public String jobTitle;	//
		   Double salary;	// can only be used in same packace
	
		   
	public void work() {
		System.out.println(name + " is working hard ...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting ...");
	}
	
	//name[name], jobTitle[jobTitle], salary[salary]"
	public void introduce() {
	System.out.println("Name[" + name +"], jobtitle[" + jobTitle+"], salary[" + salary + "]");
	}
	
}
