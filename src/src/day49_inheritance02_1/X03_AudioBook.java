package day49_inheritance02_1;

public class X03_AudioBook extends X01_Book {

	//audio book has own date (how many min, hours)
	private double length;
	private String narrator;
	
	
	//bunu da sonradan olusturduk, yeni seyler ekiyoruz
	public void listen() {
		//Listening to Java book Sawitch and narrated by Mario
		System.out.println("Listening " + getTitle() + " by " + getAuthor() + " and narrated by " +  narrator ); 
															// narator yerine (this.narrator) - (getnarrator()) hepsi de olur
	}
	
	
	
	
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	
}
