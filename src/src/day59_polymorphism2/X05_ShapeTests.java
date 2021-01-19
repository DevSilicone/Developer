package day59_polymorphism2;

public class X05_ShapeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X01_Shape shape1 = new X01_Shape();
		shape1.draw();
		
		X01_Shape circle = new X02_Circle();
		circle.draw();
		
		
		X01_Shape triangle = new X04_Triangle();
		triangle.draw();
		
		X01_Shape square = new X03_Square();
		square.draw();
		
		
	}

}
