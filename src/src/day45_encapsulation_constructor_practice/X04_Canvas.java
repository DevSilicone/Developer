package day45_encapsulation_constructor_practice;

import java.util.*;

public class X04_Canvas {

	public static void main(String[] args) {
		
		X03_Course course1 = new X03_Course();
		
		course1.setName("Java Programming");
		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		//course1.setTeachers(teachers); bununla kullanmak icin Array Listi yaptik
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Bob");
		javaStudents.add("Rom");
		javaStudents.add("Gulo");
		javaStudents.add("Edd");
		javaStudents.add("Soul");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		
		
		
		course1.addTeacher("Maria");					// ogretmen ekledik
		course1.addStudent("Ekaterina");				// ogrenci ekledik
		
		if(course1.getTeachers().contains("Maria")) {	// maria nin teaher olup olmadigini test ettik
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Ekaterina")) {		// it's going to private list then print it
			System.out.println("Ekaterina is a student");
		}else {
			System.out.println("Ekaterina is not a student");
		}

		
		
		course1.removeTeacher("Morodil"); 						// burada da listemizden ogretmeni kaldiriyoruz.
		course1.removeStudent("Rom");
		
		if(!course1.getTeachers().contains("Morodil")) {			// bu ve asagidaki if else ile de test etmis oluyoruz.
			System.out.println("Murodil is removed successfully");
		}else {
			System.out.println("Murodil is still a teacher");
		}
		
		if(!course1.getStudents().contains("Rom")) {
			System.out.println("Rom is removed successfully");
		}else {
			System.out.println("Rom is still a teacher");
		}
		
		
	}

}
