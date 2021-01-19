package day53_method_hiding_git_intro_06;

public class X03_Capital extends X01_City{					// => city doesn't have no argument constructor.

	private long population;						// getter-setter yapiyoruz.
	
	public int count = 1;
	
	public X03_Capital(int id, String name, long population) {			// => city has only have id and name
		super(id, name);							// => no argument cons. oldugu icin bunu kendimiz hallediyoruz bu sekilde, veya oto olarak da yapabiliriz.
		this.population = population;				// => =>	asagidaki getter-setter ile ayni anlama geliyor
	}
//	=======================================================================================================================================================	
//	STATIC METHOD HIDING
	
	public static void buildARoad() {
		System.out.println("Capital City - building a road");
	}

//	======================================================================================================================================================
	
//	VARIABLE HIDING ornegi icin eklendi
	
	public void displayCount() {
		System.out.println("City count: " + super.count);			// => acces the copy of parent class (super.)	
																	// => bunu super yaparak count super class'dan aldik	=> burada count olmasina ragmen. 
		System.out.println("Capital count: " + count);				// bu class da count 1 olmasina ragmen, super. ile ana class'dan datayi aldik ve count=100
	}	
	
//	========================================================================================================================================================	
	
																	// => we override to string one more time	=> call to parent class to string (super.)
	@Override														// => even hashCode, equal we can do that 
	public String toString() {										// => we want to rewiew						=> super.
		return super.toString()	+ " population: " + population +" countCap: " + count;						//	=> count => data hiding icin sonradan eklendi.
																											//	=> hide inhided version
																	// => super. comes from City Class			=> originally in the object.
	}
	
	
	
// getter ve setter olmadan da ayni sonucu aliyoruz
// yukarida olusturdugumuz 											   => public Capital(int id, String name, long population)
	
	public void setPopulaion(long population) {
		this.population = population;
	}
	
	public long getPopulation() {
		return population;
	}
	
	
}
