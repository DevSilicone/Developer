package day13_ternary;

public class MoreTernary {

	public static void main(String[] args) {

		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 : 0;
		
		System.out.println("Rating " + rating);
		
		
		System.out.println();
		
		int PMhour = 6;
		//Rush hour during evening: 4 - 7
		boolean rushHour = (PMhour >= 4 && PMhour <= 7 ) ? true : false;
		
		//System.out.println(PMhour + " is rush hour? " + rushHour);
		// rushHour ==> true - yes
		// rushHour ==> false - no
		
		
		String result = rushHour == true ? "yes" : "no";
				
		System.out.println(PMhour + " is rush hour? " + result);		
		
		//======================
		System.out.println();		
		
		int AMHour = 5; //6 - 9
		// 6 - 9 amRushHour - Yes, No
		String amRushHour = AMHour >= 6 && AMHour <= 9 ? "yes" : "No";
		
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
		
	}

}
