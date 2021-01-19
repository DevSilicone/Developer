package day65_collections02;
import java.util.*;
public class X02_LoopSet {

	public static void main(String[] args) {
		
		
		
//		### SET IS UNIQUE, NO DUPLICATE ALLOWS ###
		
		Set<Integer> numsSet = new HashSet<>();
		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
		
		System.out.println(numsSet.size());
//		================================================================		
		
//		### HASHSET doesnt sorted ---- bunun yerine Tree kullanmak gerek ####		
		

//		burada unique value olmadigi icin bize hepsini print etmis oldu
//		Set<Integer> numsSet1 = new TreeSet<>((Comparator.reverOrder()));		 => bu sekilde TreeSet ile yaparsan hepsini sorted etmis olursun. (terten)
		Set<Integer> numsSet1 = new HashSet<>();
		numsSet1.add(110);numsSet1.add(1110);numsSet1.add(120);numsSet1.add(130);
		numsSet1.add(14440);numsSet1.add(15550);numsSet1.add(166660);numsSet1.add(1440);

		System.out.println(numsSet1.size());
		System.out.println(numsSet1.toString());
		
		for(int n : numsSet1) {				//---------------> forEach loopwork
			System.out.print(n + " | ");
		}
		System.out.println();
		
//		-----------------------------------------------------> 	tradational loop using for loop will not work. 
		
		numsSet.forEach(n -> System.out.print(n + "| ")); //---> forEach method work.  --> with lampda 
		
		
	}

}
