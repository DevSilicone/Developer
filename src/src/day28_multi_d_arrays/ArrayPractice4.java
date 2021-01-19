package day28_multi_d_arrays;

import java.util.*;

public class ArrayPractice4 {

	public static void main(String[] args) {
		
		
		// ### FootballTeams ####
		
		String[][] teams = new String[2][6];
		
		teams[0][0] = "Irina";
		teams[0][1] = "Laila";
		teams[0][2] = "Bush";
		teams[0][3] = "John";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Jay";
		teams[1][1] = "Roy";
		teams[1][2] = "Matt";
		teams[1][3] = "Dimitri";
		teams[1][4] = "Oliver";
		teams[1][5] = "Kath";
		
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]); // irina
		System.out.println(teams[0][3]); // john
		System.out.println(teams[1][5]); // Kath
		
		//Print how many rows/teams/arrays
		System.out.println("Number of rows: " + teams.length);
		System.out.println("People of in first team: " + teams [0].length);
		System.out.println("People of in first team: " + teams [1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		
	}

}
