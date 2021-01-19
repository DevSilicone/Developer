package day47_blocks;

public class X10_AllBlocksTest {

	public static void main(String[] args) {

		X09_AllBlocks all1 = new X09_AllBlocks();
		X09_AllBlocks all2 = new X09_AllBlocks();
		
		System.out.println(all1.nonStaticInt);	// 18 
		System.out.println(all1.staticInt);		// 25 cunku her defasinda bir copy birakiyor statik
		
		System.out.println(all2.nonStaticInt);	// 18
		System.out.println(all2.staticInt);		// 25 
		
		// XAll blocksa 10, 10 olarak verdigimiz degerleri inceler
		
		
		
	}

}
