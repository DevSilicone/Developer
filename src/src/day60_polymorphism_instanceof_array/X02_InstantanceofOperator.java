package day60_polymorphism_instanceof_array;

import day59_polymorphism2.*;

public class X02_InstantanceofOperator {								//=> this operator you need when you use pholymorphism 

	public static void main(String[] args) {
		
		X01_Shape shape = new X03_Square();
		
//		getClass().getName() method
		System.out.println(shape.getClass().getName());				//=> it gives you package name + class name 
		System.out.println(shape.getClass().getSimpleName());		//=> it gives you class name				//=> it's only looking actual object type(square)
		
		if(shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a Triangle!");
		}else if(shape.getClass().getSimpleName().equals("Circle")){
			System.out.println("It is a Circle!");
		}else if(shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is a Square");
		}
		
//		same check using instanceof operator						//=> return true or false
		System.out.println(shape instanceof X03_Square);
		System.out.println(shape instanceof X02_Circle);
		System.out.println(shape instanceof X04_Triangle);
		
		System.out.println(shape instanceof X01_Shape);					//=> parent class
		System.out.println(shape instanceof Object);				//=> 

		
		if(shape instanceof X04_Triangle) {
			System.out.println("It is a Triangle!!");
			shape.draw();
		}else if(shape instanceof X02_Circle) {
			System.out.println("It is a Circle!!");
			shape.draw();
		}else if(shape instanceof X03_Square) {
			System.out.println("It is a Square!!");
			shape.draw();
		}
		
//		====================================================================================================		
		
		
		X01_Shape[] shapes = {new X04_Triangle(), new X03_Square(), new X02_Circle(),
				  new X04_Triangle(), new X03_Square(), new X02_Circle()};		
		
		int circles = 0, squares = 0, triangles = 0;
		// using for each loop find our number of each type
		
		for(X01_Shape sh : shapes) {
			if(sh instanceof X02_Circle) {
				circles++;
			}else if (sh instanceof X03_Square) {
				squares++;
			}else if (sh instanceof X04_Triangle) {
				triangles++;
			}
		}
		
		System.out.println("circles: " + circles + "\n"+
							"squares: " + squares + "\n"+
							"triangles: "+ triangles);
		
		
	}

}
