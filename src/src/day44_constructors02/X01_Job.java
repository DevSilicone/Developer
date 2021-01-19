package day44_constructors02;

public class X01_Job {
	
	/*
	public Job() {		// this is compailer free constructor. default. it will use own program.
		super();
	}
	*/
	
	/*
	 * title , company , annualSalary
	 */
	private String title;
	private String company;
	private double annualSalary;
	
	
	 
		 
	
	/* Encapsulate above private instance fields 
	 * Create no arg constructor
	 * 		to set title, company to "undefined"
	 */ 	
	public X01_Job() {
		System.out.println("No-args constructor"); //=> normalde iceriye bu mesaji yazmiyoruz
		title = "undefined";
		this.company = "undefined";
	}
	
	
	/* Create 1 arg constructor to set title
	 * company to "undefined"
	 */
	 
	/*
	 * create a method called toString
	 * 	
	 * */
	
	public X01_Job(String title) {
		System.out.println("One - arg constructor");
		this.title = title;
		this.company = "undefined";
	}
	
	//  create 3 args constructor to set all 3 fields
	public X01_Job(String title, String company, double annualSalary) {
		System.out.println("Three-args constuctor");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}
	
	
	
	 
	
	@Override	// en basa \n koyarsak da print ettiginde cikan virguller cikmiyor(istegimiz bu)
	public String toString() {																	// bu sona \n koyarsak alt alta print eder ama basta virguller kaliyor
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	
	
	public String getTitle() {				// constructur can not call from method
		return title;
	}
	public void setTitle(String title) {
		// we can add conditions 
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	 
	
	
	
	
	
	
}
