package day42_encapsulation;

public class X01_Person {

	// declare name and age encapsulation data
	
	private String name;
	private int age;
	
	
	// public getter and setter methods for name
	// read only
	
	public String getName() {				// sadece getName diyorsun
		return name;
	}
	
	
	// write only method with setter
	
	public void setName(String name) {		// yukarida yazdigimiz String name olarak asagi aliyoruz, baska isim koymuyoruz ki daha sonra karismasin cok veri oldugunda 
		this.name = name;						// this. dersek yukarida verdigimiz name ile match oluyor, yoksa olmuyor, baska veri algiliyor.
		// mean always instance veriable
	}
	
	
	
	public static void main(String[] args) {
		
		X01_Person p1 = new X01_Person();
		p1.age = 1;
		p1.name = "Jim";
		System.out.println(p1.name);
		
		p1.name = "yavuz";
		System.out.println(p1.name);
		
//		p1.setName("Yavuz");
//		System.out.println(p1.name);
			
	}
	
}
