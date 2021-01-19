package day67_generics;

class TwoValues<E, U> {
	
	E e;
	U u;
	
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
	public U getU() {
		return u;
	}
	public void setU(U u) {
		this.u = u;
	}
	public TwoValues(E e, U u) {
		super();
		this.e = e;
		this.u = u;
	}
}

public class GenericClasses2 {
	
	public static void main(String[] args) {
		
//		TwoValues<Integer, String> obj = new TwoValues<Integer, String>(42, "98");
//		System.out.println(obj.e + obj.u);
		TwoValues<Integer, String> obj1 = new TwoValues<Integer, String>(42, "98");
		obj1.setE(42);
		obj1.setU("98");
		System.out.println(obj1.getE() + obj1.getU());
	
		
	}

}
