package day54_protected_AccessModifier_07_2;

import day54_inheritance_review_07.X03_Class2;

// public class Class1 extends class2 {
	
	//	=						===============================> PROTECTED already existing this class. 	=> default olarak zaten burada oluyor protected. 
//	
//	public static void main(String[] args) {		=> ONLY public accessible out of the package by the object. (dogrudan)
//		
//													=> protected is visible only in the sub class => it can be INHERITED but it canNOT be ACCECIBLE thourght the object out of the package. 
//		Class2 obj = new Class2();					=> Acces modifier olan protected'e ulasip, oradaki degeri inherited yapamiyor sub class, (dogrudan).
//		System.out.println(obj.totalNumber);		
//													=> protected variable can be inherited, inherited in sub class.
//	
//													=> ama object'leri class1 yaparsan, inherited olur ve 
//	}
//}