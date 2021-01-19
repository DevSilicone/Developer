package day40_customclasses__methods;

public class X09_Company {

	public static void main(String[] args) {
		
		X08_Employee emp1 = new X08_Employee();
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 115000.0;
		
		emp1.introduce();
		emp1.work();
		emp1.attendMeeting();
		
		System.out.println();
		
		emp1.jobTitle = "Team Lead";
		emp1.salary = 120500.2;
		
		 emp1.introduce();			// change the salary then put variables // print etmez yoksa yeni olanlari, bir oncekini print eder
		emp1.work();
		emp1.attendMeeting();
		
			
	}
}
