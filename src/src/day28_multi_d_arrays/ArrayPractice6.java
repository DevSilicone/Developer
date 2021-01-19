package day28_multi_d_arrays;

import java.util.Arrays;

public class ArrayPractice6 {

	public static void main(String[] args) {
		
		// Loop 2-D (Dimension) Array
		
		String[][] pizzas = {
				{"pineapple", "pepperoni"},										// 0
				{"anchovies", "mushroom", "olives"},							// 1
				{"4 cheese"},													// 2
				{"chicken", "tomatoes", "jalapenios", "onions"},				// 3
				{"green peppes", "zuccini", "brocolli", "spinach", "shirimp"},	// 4
				};
		// System.out.println(Arrays.toString(pizzas[0]));
		
		for ( String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");		//==> sira numarasi veriyor (2,3,1,4,5)
			System.out.println(Arrays.toString(pizza)); // ==> hepsini print ediyor
			
		}
		
//**********************************************************************************************************************************
		
		System.out.println("##### FOR LOOP ####");
		
		for(int i = 0; i < pizzas.length; i++) {					// start looping for zero, how many dimensional values, in these
			System.out.print(pizzas[i].length + "-");				// how many values
			System.out.println(Arrays.toString(pizzas[i]));			// 
		}
		
//**********************************************************************************************************************************
		System.out.println();
		
		for(String topping : pizzas[3]) {						//==> direk icerige erismek istedigimiz icin [] pizzadan sonra koyduk
			System.out.println(topping);
		}
		
//**********************************************************************************************************************************
		System.out.println("*******************************************************************************************************");
		
		int[][] students = {{4,5,6},
							{12,5,7},
							{23,55,12,55,3},
							};
		
		// 2 parts: outer loop, inner loop
		// outer loop will take each group
		// inner loop will take each value/ students id
		
		for(int[] group : students) {					// ==>  []=> bunu koymamiz gerekiyor ki students olan grubu alt kumeye aliyoruz. 
				for(int studentId : group) {
				System.out.print(studentId + ", ");
			}
			System.out.println();
		}
		
//************************************************************************************************************************************
		System.out.println("********************************************************************************************************");
		
		int[][] nums = {
						{10, 20},					 // 0
						{20, 30, 40, 50},			 // 1
						{100, 200, 400},			 // 2
						{555, 333, 111, 444, 666, 78}//3
						};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j] + " ");
			}	
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
