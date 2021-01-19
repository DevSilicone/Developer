package day75_ref;
//trying to convert real life objects into coding (java objects)
//Without a class we cannot create a program! (This is not same in other languages)


public class Ref {
	
//	fields: color, weight
//	methods: write
//	other: constructors etc
	
	// There can only be one public class per source file!!!
	// file name and public class name should match
	// But it can have multiple non-public classes!!!
	// an object is created from a class
	// classes have attributes, methods and other members
	// A class is a user defined blueprint or prototype from which objects are created.
	// It represents the set of properties or methods that are common to all objects of one type. (geeksforgeeks)
		
	int x; // class attributes/fields/global variables/states/instance variables
	String y;
	// we can access these fields (even in another class) via objects
	// all objects will have different x and y values
	// x's value in object1 can be changed without affecting object2
	// if static we don't need an object to reach
	// if they are not final, we can modify fields via objects/methods
	
	// constructors
	// special blocks that are used when creating object from this class
	// named as class name
	// no return type
	// initializes the object
	// constructor is called when an object of a class is created
	// can be used to set initial values for fields (parameters - arguments)
	// The constructor is called when an object of a class is created. 
	
	// Even if we don't create a constructor,
	// java will create a default one.
	// Default one will not have parameter.
	
	// when we create a constructor, default one will disappear
	// if we have more than one constructor; overloaded constructor
	
	// access modifier Classname(Parameter list){}
	
	public Ref(int x, String y) {
		this.x = x;
		this.y = y;
		// this: refers to the variable named number in this class
		System.out.println("Two parameter constructor");
	}
	
	public Ref() {
		// no-parameter constructor
		System.out.println("No parameter constructor");
	}
	
	// without the constructors, we cannot instantiate our object like this (with two parameters)
	// when we don't create a constructor, we cannot write arguments when creating constructors
	// if we have two parameter constructor, we can no longer create object with no parameter unless we create a no parameter constructor
	// we should create another constructor with no parameters (overloading)
	// if we don't create any constructor, there will be a default one with no parameter
	
	// methods are like behaviors/actions of an object
	// methods are declared within a class, and that they are used to perform certain actions
	
	public static void main(String[] args) {
		
		// classname objectname = new classname();
		Ref myObject1 = new Ref(10, "java");
		// used Two parameter constructor
		System.out.println(myObject1.x);
	}
}


//tutorialspoint:
//Declaration - A variable declaration with a variable name with an object type.
//
//Instantiation - The 'new' keyword is used to create the object: allocates memory
//
//Initialization - The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
//giving value
//we can create one class' object in another depending on the access modifier
//	3 ways to initialize objects"
	// 1) with method, 2) with direct access to fields, 3) with constructors
	// example in W1_InitializingObjects




 class Objects {
	// default constructor
	
	Objects object1; // reference
	Objects object2 = new Objects(); // allocates memory
	
}
//		3 ways to declare objects: W7_Declare
//		// 1) assigning reference to an object
//		W7_Declare reference1 = new W7_Declare(); // in the right part, we create an object
//		
//		// 2) creating multiple objects in single statement/line
//		W7_Declare reference2 = new W7_Declare(), reference3 = new W7_Declare(), reference4 = new W7_Declare(); 
//	
//		// 3) Anonymous object
//		new W7_Declare();
//			why do we need an anonymous object?
//			if we need the object only for 1 time
//object concept: W8_ObjectConcept
//	W8_ObjectConcept reference; // this part is reference
//	// here we created a variable for object reference
//	reference = new W8_ObjectConcept("Java1"); // here we created the object
//	System.out.println(reference.getString());
//references and objects are different things
//we should assign the values
//If you create multiple objects of one class, 
//you can change the attribute values in one object, without affecting the attribute values in the other