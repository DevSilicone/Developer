package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		
		boolean b1 = 50 > 10 && 10 > 100;
		
		System.out.println("B1: " + b1);
		
		boolean b2 = 'a' == 'a' && 123 > 120;
		System.out.println("B2: "+b2);
		
		boolean b3 = true && 10 >= 10 && 100 <= 900;
		System.out.println("B3: "+ b3);
		
		boolean b4 = false && false && 10==10;
		System.out.println("B4: "+ b4);

		boolean b5 = false && true && 10==10;
		System.out.println("B5: "+ b5);
		
		boolean b6 = false || true && 10==10;
		System.out.println("B6: "+ b6);
		
		boolean b7 = false && true || 10==10;
		System.out.println("B7: "+ b7);
		
		boolean b8 = true && (true || 10!=10);
		System.out.println("B8: "+ b8);
		
		boolean b9 = true && true || 10!=10;
		System.out.println("B9: "+ b9);
		
		boolean b10 = false && (true || 10==10);
		System.out.println("B10: "+ b10);
		
		boolean b11 = false && true || 10==10;
		System.out.println("B11: "+ b11);
		
		boolean topicDone = true;
		boolean isMoreThan3Pm = true;
		boolean everyThingIsClear = true || false;
		
		boolean letsGoForABreak = topicDone && isMoreThan3Pm && everyThingIsClear;
		
		System.out.println("letsGoForABreak: " + letsGoForABreak);
		
						//false
		boolean b12 = !(true || false) && true;
		System.out.println("B12: "+b12);
		
		
								//false
		boolean b13 = !true || false && true;
		System.out.println("B13: "+b13);
		
		boolean b14=true;
		System.out.println(!!!!!!!!!!!b11); // righ to left, reversing boolean.
		
	}

}
