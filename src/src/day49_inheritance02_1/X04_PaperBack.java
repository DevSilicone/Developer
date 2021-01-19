package day49_inheritance02_1;

public class X04_PaperBack extends X01_Book {

	private int pages;
	
	
	//sonradan ekledik
	public String toString() {
		//title, authoer, price,type
		
		// bu return value oldugu icin sysou yok, return var
		return getTitle() + " | " + getAuthor() + " | " + getPrice() + " | " + getType() + " | " + pages;
	}
	
	
	
	
	

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
}
