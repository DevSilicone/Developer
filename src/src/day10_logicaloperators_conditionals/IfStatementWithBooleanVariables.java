package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
	
	public static void main(String[] args) {
		
		
		boolean isBreakTime = true;
		
		if (isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
		//second version
		
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
		boolean classTime = true;
		
		// (classTime==false) dont do this, but its work.
		if(classTime) {
		   System.out.println("Come back on time");
		   System.out.println("Stop talking");
		   System.out.println("Pay attention");
		   System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water.");
		}
		
		
		boolean qualified = false;
		// send a notification message only if not qualified
		// we need to check if qualified variable contains FALSE
		
		 //(qualified != true)
		if (qualified == false) {
			System.out.println("You application was not approved. Thank you");
		}
		
		
		
		
		
	}

}
