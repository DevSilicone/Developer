package day08_casting_conditionals;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		// automatic casting from smaller to larger to larger type
		
		System.out.println( 10 / 2.0 ); // java will make sure chose is the larger type
										// result is double
		System.out.println( 10.0 / 2);
		
		//============================================================================
		
		int result = (int) (10 / 2.0); // if you don't put (int) it will not work.
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		//double avarage = (rent1+rent2+rent3+rent4) / 4;
		double avarage = (double)(rent1+rent2+rent3+rent4) / 4;
		
		System.out.println(avarage);
		
		System.out.println("");
		
		double d = 40.2;
		int i = (byte)d;
		// in above statement both explixit and implicit casting happening.
		// you would not do that ever. even if you put like this, these happining.
		
		// explicit : double > byte,
		// implicit : byte > int,
		
		
		
		
		
		
		
		

	}

}
