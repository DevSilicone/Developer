package day52_object_class_05_2;

public class X01_SubObject extends Object {				// Bu java da yuklu olan arka plandaki OBJECT class.
	//	=====================================================================================================================================
	//	public void toString {	// void koydugun zaman uyari veriyor, change to String diye. cunku bu sekilde override olmamis oluyor
		
		@Override									// otomatik olarak java object'den override oldu 
		public String toString() {					// burada override yaptik, OBJECT CLASS'tan - javanin icindeki arka plandaki OBJECT CLASS'dan(toString) ile.
			return"";								// override, calismasi icin return yapip "" koyduk geri return icin. o zaman calisiyor.
		}
	//	ust taraf javanin object class'ina Override	// when we create a toString method in our custo class, we are overriding it from Object class.
													// In overriding, we keep method signature same(NAME, Params). -> bu zaten Overriding rule
													// return tye MUST be same or covariant -> bu da aten Overriding rule.
	
		
		public void toString(int j) {				// burada da OVERLOADING yaptik - parmater (int) koyduk - javanin ana class'i ile farkli odugu icin calisir.
													// OVERLOAD Kurali neydi-> signature different - (int j) koyunca - javanin ana objet class'i olan string'ten farkli olmus oldu
													// return type da gerek yok overload'da - yine overload kurali bu da.
													// access modifier'i degistirebiliriz(public), return type(void) degistirebiliriz -> bunlar OVERLOADING kurali zaten
		}
		
		
		
		
	//	=====================================================================================================================================
		public static void main(String[] args) {
			
													// if a class does not extends any other super class, java will add *extends Object* to it
													// yani - yukarida actigimiz SubObject isimli class, extends yapilmasa dahi, java otomatik ekliyor, arka planda
			X01_SubObject sb = new X01_SubObject();			// sonuc olarak java'da actigimiz her clas, dunyadaki her class-java'nin sub clasidir. 
			sb.toString();
													// .toString() -> some popular methods in java
													// it comes from Object Class and we can override this method in our custom class. 
													// It is used to describe the object in a string format.
			
			
	//				### .STRING() method ###		
			
	}

}
