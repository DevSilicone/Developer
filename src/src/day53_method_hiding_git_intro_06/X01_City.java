package day53_method_hiding_git_intro_06;
public class X01_City {
	
	private int id;
	private String name;
	public int count = 100;							// =>	inhereted to everybody => hiding yapmak icin sonradan ekledik
										
	public X01_City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	
//	=============================================================================================================================================	
//	STATIC METHOD HIDDING
	
	public void letsBuildARoad(){					//	=> asagida bulunan static => static olmayan bir class ile cagirdik =>
		buildARoad();								//	=> non static => can static
	}
	
//	==============================================================================================================================================	
//	STATIC METHOD HIDDING	
	
	public static void buildARoad() {
		System.out.println("City - building a road");
	}
	
//	===============================================================================================================================================	
	@Override
	public int hashCode() {
		return id + name.length(); 					// length()
													// => it's mean these are realy really close, after our print (129, 452, 452)
													// => id is already int	=> name.length() also int.
	}
	
//	===============================================================================================================================================	
//	what method we can OVERRIDE from object class. => toString.
//	what's a purpose of toString normaly?
//	Convert your object describe in String format
//	You take the values, you putting String format any format you want before we use to generate it will put bracets something like that
//	But you can do anyway you want
	
	@Override										// from (package java.lang;)		=>	Javanin kendi Package'sinden geliyor
	public String toString() {						// we OVERRIDE from OBJECT CLASS	=>	"toString"
		return "id:" + id + " name: " + name + " count: "+count;	// data hiding icin "count" sonradan eklendi.
	}
//	==================================================================================================================================================	
//	also another method we can OVERRIDE
//	1)	since inherited from OBJECT CLASS, we have to type here (equals(Object))	=> signature must match
//	2)	You wanna compare one object one CITY with another one.						=> you need to convert it first.
	@Override
	public boolean equals(Object obj) {					
		X01_City anotherCity = (X01_City)obj;					//	=> 2) this call CASTING => we will talk more details in "POLYMORPHISM" topics.
														// 	=> 2) basicly 			=> you take a CITY, you MAKE a NEW one.
//	we could put return here (if yerine) 		
		if(this.id == anotherCity.id &&
			this.name.equals(anotherCity.name)) {
			return true;								//	=> it's up to you
		}
		return false;									// 	=> we don't need else, 
														//	=> because if cond. true => it will exit the method => it will never reach that point FALSE.
	}
//	====================================================================================================================================================
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
