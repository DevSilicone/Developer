package day12_switch_ternary;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade = 'P';
		//A or B or C => Pass		D,E => Fail   Invalid grade
		
		// ### OR || PIPE #####
		
		switch(grade) {
			case 'A':	// 3 case tek gibi algiliyor
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':	// 2 case tek gibi algiliyor
			case 'E':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade");
		}

	}

}
