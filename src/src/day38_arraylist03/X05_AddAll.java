package day38_arraylist03;

import java.util.*;

public class X05_AddAll {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		List<String> l2 = new ArrayList<>();
		l2.add("c#");
		l2.add("C++");
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		/*
		for(String value: l1 ) {
			l2.add(value);
		}
		*/
		
		// simple say -> yukaridaki yerine
		l2.addAll(l1);
		System.out.println(l2);
		
		//usttekini tekrar ayni yapabiliruz
		l2.addAll(l1);
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		
		

	}

}
