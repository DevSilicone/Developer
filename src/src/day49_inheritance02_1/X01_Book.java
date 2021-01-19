package day49_inheritance02_1;

public class X01_Book {

	private String title;
	private String type;
	private String author;
	private double price;
	
	// yukariya bu class dan baskasi ulasamiyor
	
	// bu class normalde ENCAPSULATION
	
	
	// asagidakilerin hepsi getter-setter oldu (bu yuzden INHERITANCE-sub calss lar ulasabiliyor. (normalde yukarisi private oldugu icin ulasamaz)
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
