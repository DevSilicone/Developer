package day55_abstraction2;

// 1) create a Shape abstract class
// 2) create instance fields: name, area(double);
// 3) create 2 abstract method as below:
//	 calculateArea() return double, no args
//	 draw() void
// 4) create one constructor that sets name-value
// 5) create no arg constructor and call super class's one arg constructor

public abstract class X01_Shape {
	String name;								//=> instance variable
	double area;									//=> instance variable
	
	public X01_Shape(String name) {					//=> constructor.
		super();								//=> if you don't put, java add otomatically. => parent class constructor.
		this.name = name;
	}
	
	public abstract double calculateArea();
	public abstract void draw();
	
	
	
}
