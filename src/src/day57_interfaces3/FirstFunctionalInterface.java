package day57_interfaces3;

// Huseyin hoca ornek

@FunctionalInterface 
interface FirstFunctionalInterface{
    
	public abstract String abstractMethod(int a, String b);
	
}


class MyClass implements FirstFunctionalInterface{
    
	@Override
    public String abstractMethod(int a, String s) {
        System.out.println("Hello");
        return "";
    }
    
    
    public static void main(String[] args) {
    	
    	
        // 1. Way
        MyClass obj = new MyClass();
        obj.abstractMethod(5, "");
        
        
        // anonymous
        // 2.Way
        FirstFunctionalInterface interfaceAno = new FirstFunctionalInterface(){
            @Override
            public String abstractMethod(int a, String s) {
                System.out.println("Hello");
                return "returning String";
            }
        };
        
        
        // 3.Way with Lambda   // Type inference 
        FirstFunctionalInterface interfaceLambda =  (x, s) -> {
            if(x==0)
            System.out.println("returning String");
            else
                System.out.println("something else");
             return "returning String";
        };
                                            // parameters   // body of the lambda
    }
}


/*
// no parameters
() -> 42;
() -> "String"
() -> { return "something else"; }
() -> {System.gc();}
 */