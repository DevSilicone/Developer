package day05_math_operators;

public class CompanyWarmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare variables:
		/* companyName
		 * address
		 * numberOfEmployees
		 * revenue
		 * isTechCompany
		 */
		
		// Assign values:
		/* "Facebook"
		 * "Silicon Valley, CA"
		 * 10000
		 * 500234123
		 * yes
		 */
		
		// Print statements and describe each value:
		/* Company name is Facebook
		 * Address is ...
		 * Number of employees is 10000
		 * Annual revenue is 500234123
		 * Is it tech company? - true
		 */
		
		//=============================================
		/* Create a String variable about Company and describe the company and assign as a value.
		 * Print value of about Company vaiable
		 */
		//"Company Facebook is located in Montana View, CA and 10000 ppl for it. It's revenue is ### and it is a tech company-true."
		//==============================================
		
		String companyName = "Facebook";
		String adress = "Silicona Valley, CA";
		int numberOfEmployees = 10000;
		long revenue = 5000234123L;
		boolean isTechCompany = true;
		
		System.out.println("Company name is "+companyName);
		System.out.println("Adress is "+adress);
		System.out.println("Number of employees is "+numberOfEmployees);
		System.out.println("Annua revenue is "+revenue);
		System.out.println("Is it a tech company? - "+isTechCompany);
		
		//System.out.println(revenue + isTechCompany); will not work long and boolean
		//System.out.println(companyName + numberOfEmployees); it will work because of String+int(number)
		
		System.out.println(); // satir arasi bosluk yapmak icin
		
		String aboutCompany = "company "+companyName+" is located in "+adress
				+ "\n \t and "+numberOfEmployees +" work for it."; 
		
		// \n de satir icerisinde bir alt satira geciriyor.
		// \t de tab gorevi gorerek ileri satir atiyor.
		
	
		
		System.out.println(aboutCompany);
		
		
		//=========================================================================================================
		
		String str = ""; // yan yana yazdirir.
		
		System.out.println(str);
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+num2);
		System.out.println(num1 +""+ num2);
		System.out.println(num1 +str+ num2);
	}

}
