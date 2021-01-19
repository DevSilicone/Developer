package day27_arrays04;

public class ArrayPractice3 {

	public static void main(String[] args) {
		
		/* #### TOLLS #### */

		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
		
		for(String tool : tools) {
			switch(tool) {  					// ==> .toLowerCase() - yazarak kucuk harf ile yazabiliriz.
			case "Java":
				System.out.println("Java --> Programming language");
				break;
			case "Selenium":
				System.out.println("Selenium --> Test Automation");
				break;
			case "TestNG":
			case "JUnit":
				System.out.println(tool + "--> Testing tool");
				break;
			case "Cucumber":
				System.out.println("Cucumber --> BDD Style testing");
				break;
			case "Git":
				System.out.println("Git --> Version control");
				break;
			case "Maven":
				System.out.println("Maven --> Building and execution for project ");
				break;
			default:
				System.out.println("Unknown tool");
			}
		}
		
		
	}

}
