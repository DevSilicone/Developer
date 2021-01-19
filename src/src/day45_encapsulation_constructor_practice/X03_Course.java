package day45_encapsulation_constructor_practice;
import java.util.*;

 public class X03_Course {

	/*
	 * name
	 * teachers (List<String> teachers	// for list go here array, you can do you sure or note for count
	 * students	(List<String> students // depending on your data, you can also add a List as an instance variable.
	 * 									// course has a List of Teachers.
	 * 									// Shop has a List of items
	 * 									// Mall a List of stores			// for multiple // if you not sure count
	 * */
	
	private String name;
	private List<String> teachers = new ArrayList<>();
	private List<String> students = new ArrayList<>();
	
	
	
	
	public void addStudent(String stName) {					// this is instance method / direk yukaridaki teacher ve studenta atiyor
		students.add(stName);
	}
	
	public void addTeacher(String thName) {
		teachers.add(thName);
	}
	
	public void removeStudent(String stName) {			// bir seyleri kaldirmak icin listeden
		students.remove(stName);
	}
	
	public void removeTeacher(String thName) {
		teachers.remove(thName);
	}
	
//====================================================================================================	
	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	
}
