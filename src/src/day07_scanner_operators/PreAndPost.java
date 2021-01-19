package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		
		int num = 0;
		int num2 = num++;
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
		
		
		System.out.println("");
		
		
		int n = 0;
		int n2 = ++n;
		System.out.println("n: "+ n);
		System.out.println("n2: "+ n2);
		
		
		System.out.println("");

		int i = 10;
		i++; //add 1 automatically - sonuctan sonra 1 ekliyor.
		++i; //add 1 automatically - degere bastan 1 ekliyor.
		System.out.println("I value " + i);
		
		System.out.println("");
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: " + bananas);
		System.out.println("pears: "+ pears);
		System.out.println("apples: "+ apples);
		
		System.out.println("");
		
		int friends = 10;
		System.out.println(++friends);
		System.out.println(friends++);
		System.out.println(friends);
		
		System.out.println("");
		
		int p1 = 10; 		// p = p +1 (sonuc olarak alt satirda yazilan p1++, p degeri oluyor)
		int sum = p1++ + 5; // p1 + 5 and assign to sum (p1++ eger varsa bir sonraki islemde kullanima giriyor.
		
		System.out.println("sum: " + sum);
		System.out.println("p1:" + p1);
		
		//=============================================================================
		System.out.println(" ");
		
		int batteries = 8;
		int oldBatteries = 5;
				//14		  // 8		 +	 6
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("batteries: "+ batteries);
		System.out.println("oldBatteries: "+ oldBatteries );
		System.out.println("totalBAtteries "+ totalBatteries);
		
		

		
	}

}
