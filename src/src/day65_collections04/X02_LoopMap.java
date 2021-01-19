package day65_collections04;
import java.awt.RenderingHints.Key;
import java.util.*;

import org.omg.CORBA.portable.ValueBase;

import day53_method_hiding_git_intro_06.X01_City;
import day65_collections02.X04_Student;
public class X02_LoopMap {

	public static void main(String[] args) {
		
		Map<String, String> dataMap = new HashMap<>();
		
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("userName", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Rome");
		dataMap.put("storemanager", "John Doe");
		
		
		// keySet => returns set with all the keys in the map
		// values => returns list with all the values in the map
		
		
		System.out.println("### KEYS ###");
		for(String key: dataMap.keySet()) {							//=> loop ile key olanlari al hepsini print et dedik.
			System.out.println(key);
		}
		
		
		System.out.println("### VALUES ###");						//=> loop ile value olanlari print ettik
		for (String value : dataMap.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("### KEYS | VALUES ###");
		for(String key: dataMap.keySet()) {
			System.out.println(key + " | " + dataMap.get(key));
		}
		
//		----------------------------------------------------------		
//		Map ile yapilacbileceklere ornekler (very powerful)		
		Map<Integer, X04_Student> studentsMap = new HashMap<>();
		Map<String , String[]> data = new HashMap<>(); 
		Map<Integer , List<String>> data2 = new HashMap<>(); 
		Map<Integer , List<String[]>> data3 = new HashMap<>(); 
		Map<String , Map<Integer, Integer>> data4 = new HashMap<>(); 
		Map<String , Map<Integer, X01_City>> data5 = new HashMap<>(); 
		List<Map<String, Map<Integer, X01_City>>> list = new ArrayList<>();
		
		
	}
	
}
