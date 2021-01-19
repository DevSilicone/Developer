package day04_primitives_operators;

public class UsingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare int variables num1, num2, num3
		int num1, num2, num3;
		
		//assign 100 to num1
		num1 = 100;
		
		//assign values of num1 to num2
		num2 = num1;
		
		//print num1 and num2 values in separete lines
		System.out.println(num1);
		System.out.println(num2);
		
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//declare apples and assign 25
		//declare kiwis and assign value of apples to it
		//declare mangoes and 55
		//assign value of mangoes to kiwis
		
		int apples = 25;
		
		int kiwis = apples;
		
		int mangoes = 55;
		
		kiwis = mangoes;
		
		System.out.println(apples);  // 25
		System.out.println(kiwis);   // 55
		System.out.println(mangoes); // 55
		
		//SUMMARY
		//veriables
			//declare
			//assign value
			// use them: print them or assign it to different variable
		
		//=============================================================
		
		//STRING TYPE
		//System.out.println("java");
		//int num = 322;
		//String lan = "java";
		
	}

}
