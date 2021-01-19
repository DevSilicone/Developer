package day57_interfaces3;
//
//import java.util.*;
//
//import java.util.function.Predicate;
//
//class PredicateExe {
//	
//    public static void main(String[] args) {
//    	
//        List<String> employees = new ArrayList<>() {{
//            add("Ahmet");
//            add("John");
//            add("Marry");
//            add("Will");
//            add("Jenkins");
//        }};
//        
//        printAnyThingIWant(employees, emp -> emp.startsWith("J"));
//        printAnyThingIWant(employees, x -> x.contains("a"));
//        printAnyThingIWant(employees, v-> v.length() > 9);
//        
//    }
//    
//    private static void printAnyThingIWant(List<String> employees, Predicate<String> query) {
//        for (String employee : employees) {
//            if (query.test(employee)) {
//                System.out.println(query);
//            }
//        }
//    }
//}