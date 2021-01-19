package day55_abstraction2;

public class X03_Triangle extends X01_Shape{

	double length1;
	double length2;
	double length3;
	
	public X03_Triangle() {
		super("Triangle");
		// TODO Auto-generated constructor stub
	}

	public X03_Triangle(double length1, double length2, double length3) {
		super("Triangle");
		this.length1=length1;
		this.length2=length2;
		this.length3=length3; 
		
		
	}
	
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double p = (length1 + length2 + length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("     *  \n" + 
				"    ***\n" + 
				"   *****\n" + 
				"  *******\n" + 
				" *********");
	}

	

}
