package day55_abstraction2;

public class X04_ShapeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X02_Circle circle1 = new X02_Circle(10);
		circle1.calculateArea();
		System.out.println("Calculated area of circle: " + circle1.calculateArea());
		circle1.draw();
		
		X03_Triangle triangle1 = new X03_Triangle(5, 5, 5);
		System.out.println("Area: " + triangle1.calculateArea());
		triangle1.draw();
		
		
	}

}
