package day48_inheritance01;

public class X02_Student extends X01_Person {
	
	// eger burayi silersen - student kismi hata verir (school) icerisinde yazdirdiklarimiz.
	
	// burasi ilk yazdigimiz PERSON dan verileri almis oldu
	
	// School icerisinde hem bunu hem personu kullandik
	
	
	// ama iceriye ek yeni seyler ekleyebiliriz.
	
	int studentID;
	String clazz;
	
	public void code(String lang) {						// lang -> language dedik
		System.out.println(name + " is coding " + lang);
		
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + clazz + "class");
	}
	
		
}
