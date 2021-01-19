package day46_static_keyword;

public class X01_Customer {

	/*Customer
	 * encapsulated
	 * 
	 * => String name
	 * => String email
	 * 
	 * => getters and setters
	 * 
	 * 2 constructoes:
	 * 	=> no-args
	 * 	name = "undefined"
	 * 	email = "undefined"
	 * 
	 * 	=> 2 args
	 * 
	 * -> toString
	 * 
	 * -> static int count
	 * 	when a variable is static, it is a shared variable by all objects, there is one central copy of it in memory
	 * */
	
	private static String name;		// buraya static koyarsak hepsi "bur cal" olurak print oldu diger tarafta
	private String email;
	
	//int count;		==> bu sekilde yazinca sonuc print etmiyor, iste burada static yapiyoruz
	
	static int count;		// shared by everyome?? all object// simdi de 3 gosteriyor sonucu
							// one central copy of this variable
		//bu kisima kac dersek hepsini o kadar kopya gibi yapar, asgiyi da yukariyi daetkiler. 10 dersek 10, 50 ise 50
	
	
	
	public X01_Customer() {
		//super();			// simdilik buna gerek yok
		name = "undefined";
		this.email = "undefined";	// buna gerek yok ama koyada biliriz bu ornekte
		count++;
	}


	public X01_Customer(String name, String email) {
		//super();			// simdilik buna gerek yok
		this.name = name;
		//this.email = email;
		setEmail(email);
		count++;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

	
	
	
	
}
