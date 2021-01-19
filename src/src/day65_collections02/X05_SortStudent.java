package day65_collections02;
import java.util.*;
public class X05_SortStudent {

	public static void main(String[] args) {
		
		List<X04_Student> stList = new ArrayList<>();
		
		stList.add(new X04_Student(300, "Romen"));
		stList.add(new X04_Student(87, "Brayn"));
		stList.add(new X04_Student(89, "Idam"));
		stList.add(new X04_Student(1, "Grizma"));
		stList.add(new X04_Student(10, "Anara"));
		stList.add(new X04_Student(101, "Vlado"));

		System.out.println(stList.toString());
		
		Collections.sort(stList);				//=> custoM olarak olusturdugumuz student classi siralayamiyor. Bunu gidip implement Comparable yapmamiz gerek.
		
		System.out.println(stList.toString());
		
		
		String st1 = "w";
		String st2 = "b";
		System.out.println(st1.compareTo(st2));
				
		
		X04_Student student1 = new X04_Student(10,  "Adam");		//=> burada artik siralamayi ypamak icin bastaki rakamin hangisi buyuk, ona gore 0,1,-1 diyor
		X04_Student student2 = new X04_Student(5,  "ola");
		
		System.out.println(student1.compareTo(student2));	//=> 1 
		
//		stList.sort(c); needs comparator object 		
		
	}

}
