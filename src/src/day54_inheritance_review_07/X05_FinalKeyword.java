package day54_inheritance_review_07;

//	interview question

class data1{							//=> 2 private data, have many you can create getter-setter.
	
	private String password = "123456";	//=> setter change value - but private is final -> you canNOT change it value again. 
	private final int age = 40;
	
//	getter	
	public String getPassword() {
		return password;
	}
	
//	getter	
	public int getAge() {
		return age;
	}
	
//	setter	
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public void setAge(int age) {		//=> final variable canNOT have setter
//		this.age = age;
//	}
//	
//	
	
}
//	========================================================================================================================================
public class X05_FinalKeyword {

//	final:	=> value cannot be changed
//			=> variable, class and methods
	
//			variable:	
//					1) local variable	 => doesn't need to be initialized immediately
//										 => caNOT be RE-assigned	
	
//					2) instance variable => needs to be initialized 		immediately.
//											can be initialized in either instance block or constructor.
//					3) static variable	 => needs to be initialized			immediately
//											can be initialized in static block
	
//			class : class canNOT extended
//						=> Abstract class canNOT be final			
	
//			method : canNOT be override,
//						=> can be final
	
//					Constructor(method) canNOT be final			=> Constructor, can only have Access modifier, and class name (mandatory)		
//																=> Constructor, can NOT specifier like static, final, abstract
//																=> no Return type.
	
	
	final String name;
	
	{	
		name = "Batch 11";					//=> INSTANCE blok execute first.
	}										//=> canNOT assigned it value in the instance blok.
	
//	public finalKeyword() {					//=> bu durumun olabilmesi icin yukaridaki instance block olmamali
//		name = "Batch 13";					//=> if we are re-assigned final variables value, its not giving us compiler error (but one time)
//	}
	
	
	final static String school;				//=> this is static variable, belong the classes. it's need to be initialize it as soon as clases is load it.
	
	static {								//=> Stattic blok ONLY initialize class variables. that are finals
		school = "Cybertek";
	}
	
	
	
	public static void main(String[] args) {
		final boolean result = false;
//		result = false;							=> final variable can not be re assigned (only one time initialize)

		
	
}	
	
	
	
}
