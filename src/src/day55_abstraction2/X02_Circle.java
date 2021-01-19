package day55_abstraction2;

public class X02_Circle extends X01_Shape {

	double radius;
	
	public X02_Circle() {
		super("Circle");
	}
	
	public X02_Circle(double radius) {
		super("Circle");
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI + Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	}

}
