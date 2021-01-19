package day08_casting_conditionals;

public class IfElseWithVariables {

	public static void main(String[] args) {
		
		int temperature = 65;
		
		if(temperature >= 65) {
			System.out.println("It is a nice day! Lets code java"); //True
		}else {
			System.out.println("Stay home and code java");
			
		}	
		
		System.out.println("");
		
		// 2 int variables, teamAScore, teamBScore
		// put a condition. check if teamA won. 
				//"Team A won".
				//Go to Team A!
		// else "team b won or it was a draw
				//Go Teams!
		
		int teamAScore = 5;
		int teamBScore = 6;
		
		if (teamAScore > teamBScore) {
			System.out.println("Team A won");
			System.out.println("Go Team A!");
		}else {
			System.out.println("Team B won or it was a draw");
			System.out.println("Go Teams!");
		}
		
		
		
		
		
	}
	

}
