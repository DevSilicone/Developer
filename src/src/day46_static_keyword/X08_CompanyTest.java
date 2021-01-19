package day46_static_keyword;

public class X08_CompanyTest {

	public static void main(String[] args) {
		
		//print cname variable value
		System.out.println(X07_Company.cname);
		System.out.println(X07_Company.cname.toUpperCase());
		
		
										// usttekiler ile de ayni seyler
										// bunlarin ikisi de ayni seyler oluyor o yuzden calisiyor bu sekilde
		X07_Company.cname.toUpperCase();	// (company-calas name)(cname - static variable)(toUpperCase - method a belong variable)
		System.out.println();			// (system - class name)(out - variables )(println - methods a belong variables)
		
			
		
		X07_Company c = new X07_Company();		// if you have static yani en ustteki cname bizim icin
		System.out.println(c.cname);	// you can access through to object 
		c.companyInfo();				// or you can access through to class neme - up to you
		X07_Company.companyInfo();			// yani bunlar ayni sonuclari veriyor, hangisini kulanmak isterse.
		
		
		 
		
	}

}
