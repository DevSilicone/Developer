package day60_polymorphism02;

public class X05_AppleStore {

	public static void main(String[] args) {
		
		X01_AppleDevice mac = new X02_Mac();					//=> polymorphic way
		mac.use();
	//	mac.code();										//=> code is not visible. 	=> ApplDevice methods only can be called
		
		X02_Mac myMac = new X02_Mac();							//=> full access if you don't use polymorphism
		myMac.use();
		myMac.code();
		
		X01_AppleDevice watch = new X04_AppleWatch();
		watch.use();
		
//		watch.wear(); 							<- !! ERROR
		
		
		
		X01_AppleDevice dev1 = new X02_Mac();
		System.out.println(dev1.startingPrice);
		
//		System.out.println(dev1.model);  		<- !! ERROR
		
		
		X01_AppleDevice dev2 = new X03_IPad();
		System.out.println(dev2.startingPrice);
//		System.out.println(dev2.maxScreenSize);	<- !! ERROR
		
		X03_IPad ipad = new X03_IPad();
		System.out.println(ipad.startingPrice);	//=> Good
		System.out.println(ipad.maxScreenSize);	//=> Good
		
		
		
	}

}
