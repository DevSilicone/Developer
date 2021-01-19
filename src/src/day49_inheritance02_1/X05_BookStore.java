package day49_inheritance02_1;

public class X05_BookStore {

	public static void main(String[] args) {
	
		X02_Ebook ebook = new X02_Ebook();
		
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		System.out.println("*******************************************************");
		
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		System.out.println("*********************************************************" );
		
		
		X03_AudioBook aBook = new X03_AudioBook();
		aBook.setTitle("OCA prepration");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Mario");		
		aBook.listen();
		
		System.out.println("*******************************************************");
		
		X04_PaperBack pb = new X04_PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		System.out.println(pb.toString());
		
		
	}
}
