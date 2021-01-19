package day49_inheritance02_1;

//Ebook  IS-A  Book
public class X02_Ebook extends X01_Book {

	private double size;
	private int pages;
	
	
	public void readEBook(int pageNum) {
		//reading java book by Savitch at page 10
		System.out.println("Reading " + getTitle() + " by " + getAuthor() + " at page " + pageNum);  	
		// buraya getTitle olarak aldik diger tarfatan, title olarak alamayiz.
	}
	
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
