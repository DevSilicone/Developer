package day52_object_class_05_2;

public class X02_Computer {								// burasi DEFAULT olarak EXTENDS to OBJECT class in java.
	//	Variables
		private String model;
		private String color;
	
		
	//	===============================================================================================================================	
		@Override											// bu object diger tarafta actigimiz (comp1 == comp2) veye (comp1.equals(comp2)); FALSE olana denk geliyor.
		public boolean equals(Object other) {		// 
		 	X02_Computer that = (X02_Computer) other;		// burada olusturdugumuz sey Computer Class ile ayni isimde equals Computer class Object.
			if(this.model.equals(that.model) &&	// cunku diger "Equals Method" diye actigimiz classda - onlari karsilastirmak icin
				this.color.equals(that.color)) {
				return true;						// buraya this koysak da oluyor, koymasak da ayni manada.
			}
				return false;
		}

//		yukaridakini yapmadan once bu ikisi FALSE alttaki ikisi TRUE olarakti.
		
//		System.out.println(comp1 == comp2);					// => false			=> BUNDA IKISI AYNI MEMORY mi kullaniyor diye bakiyor - bu yuzden FALSE
//		System.out.println(comp1.equals(comp2));			// => true			=> sebebi yukari actigimiz equals(Computer) cunku ayni object oldular
//																				=> true olan da 
//		
//		System.out.println(comp1 == comp2);					// => true			=> 
//		System.out.println(comp1.equals(comp2));			// => true			=> sebebi yukari actigimiz equals(Computer) cunku ayni object oldular
//		
		
	// ==================================================================================================================================	
	// super constructor
	public X02_Computer() {								// => its call OBJECT CLASS constructor. yani javanin kendi icindeki OBJECT CLASS'a baglaniyor, bos() old. icin.
			super();
		}
	
	// ==============================================================================================================================================
	
//	@Override																		// HASH CODE otomatik olarak source yaptik buraya
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		return result;
//	}

//	@Override																		// Burayi otomatik aldik HASH CODE ile birlikte. aynisini yukari tekrar yazdik.
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Computer other = (Computer) obj;
//		if (color == null) {
//			if (other.color != null)
//				return false;
//		} else if (!color.equals(other.color))
//			return false;
//		if (model == null) {
//			if (other.model != null)
//				return false;
//		} else if (!model.equals(other.model))
//			return false;
//		return true;
//	}
	
	//================================================================================================================================================
	
	//	super constructor
	public X02_Computer(String model, String color) {
			super();
			this.model = model;
			this.color = color;
		}
	
	
	
	//	Getter and Setter
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
	

	//				### EQUALS() method ###		
		
}
