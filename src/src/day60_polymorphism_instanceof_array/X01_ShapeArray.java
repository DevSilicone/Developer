package day60_polymorphism_instanceof_array;
//
//import day59_polymorphism2.Shape;				//=> bunlar da uygun olur, digeri de.
//import day59_polymorphism2.Triangle;
import day59_polymorphism2.*;
import java.util.*;

public class X01_ShapeArray {

	public static void main(String[] args) {
		
		System.out.println("###		NEW OBJECT CREATE	####");
		
		X01_Shape shape = new X04_Triangle();
		System.out.println(shape.getClass().getName());
		shape.draw(); 							//=> overriden version of draw is called.
		
//		===================================================================================
		System.out.println("###	 ARRAY	####");
		
		X01_Shape[] shapes = {new X04_Triangle(), new X03_Square(), new X02_Circle(),
						  new X04_Triangle(), new X03_Square(), new X02_Circle()};					//=>
		
		X01_Shape[] shapes2 = new X01_Shape[3];
		shapes2[0] = new X04_Triangle();
		shapes2[1] = new X03_Square();
		shapes2[2] = new X02_Circle();
		
		shapes[0].draw();
		shapes2[2].draw();
		
//		=====================================================================================
				System.out.println("###	FOR EACH LOOP ####");
		
//		left refferance type the array(Shape  ----  middle is just name what we give it----	 Right array name (shapes)
		for(X01_Shape sh: shapes ) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
		
		
		
		//create a list of Shapes shapeList and add 5 different child objects
		
//		an interface							
		List<X01_Shape> shapesList = new ArrayList<>(); 							//=> polymorphic way	=> type is parent(List) -> object sub class(arraylist)							
		
		ArrayList<X01_Shape> shapesArrayList = new ArrayList<>();					//=> normal way			=> resizable(dynamic-you can change add)
		
		shapesList.add(new X04_Triangle());
//		or
		X01_Shape newShape = new X03_Square();
//		add square
		shapesList.add(newShape);
		shapesList.add(new X02_Circle());
		shapesList.add(new X04_Triangle());
		shapesList.add(new X02_Circle());
		
		
//		draw first shape
		shapesList.get(0).draw();
		X01_Shape someShape = shapesList.get(1);
		someShape.draw();
		
		
		System.out.println("###	FOR EACH WITH LIST OF SHAPES ####");
		
		for(X01_Shape shapeItem : shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
		}
		
		
		
		System.out.println("###	FOR LOOP WITH LIST OF SHAPES ####");
		
		for(int i = 0; i < shapesList.size(); i++) {
			System.out.println(shapesList.get(i).getClass().getSimpleName().toUpperCase());
			shapesList.get(i).draw();
		}
		
		
		
		
	}

}
