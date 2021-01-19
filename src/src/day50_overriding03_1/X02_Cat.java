package day50_overriding03_1;

public class X02_Cat extends X01_Animal {
	
	
	// YANDAKI YESIL UCGENLER copy oldugu icin - ASIL OLAN CLASS da yok - bu SUB CLASS
	
	@Override // bunu bu sekilde koyabiliyorsun - anlami emin olmak icin overriding mi
	public void speak() {
		System.out.println("Cat is saying Meow Meow");		// her sey ayni ama printler farkli.
	}

	// diger classda da aynisi var bu sub class olmasina ragmen buraya yazip, cikti alacagimiz seyi degistirebiliyoruz.
	public void move(int steps) {		//OVER RIDING - INHERITED METHOD - YOU DECLARE SAMETHING - YOU CAN CHANGE THE impletation 
		System.out.println("Cat is moving " + steps + " steps ");
	}

}
