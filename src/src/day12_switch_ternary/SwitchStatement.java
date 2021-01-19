package day12_switch_ternary;

public class SwitchStatement {
	
	public static void main(String[]args) {
		
		int score = 20;
		
		//1
		//2
		
		switch (score) {
			case 1:
				System.out.println("Score is 1");
				break; // exit switch statement (get our from switch)
			case 2:
				System.out.println("Score is 2");
				break; // exit
			case 3:
				System.out.println("Score is 3");
				break; // exit ( last we dont need put it.
			default:
				System.out.println("Invalid score");
				break; //works without as well
		}
		
		
		
	}

}
