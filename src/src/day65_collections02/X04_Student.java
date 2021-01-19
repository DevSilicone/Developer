package day65_collections02;

public class X04_Student implements Comparable<X04_Student>{

	private int id;
	private String nameString;
//	--------------------------	
	public X04_Student(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}													// bu islemi yapabilmek icin en yukarida implemet yaptik COMPRABLE<>
														//=> bunu yaparken id siraladik ama student da siralayabilirdik.
	@Override											//=> bu override ile custom olarak olusturdugumuz class'i sorted edebiliyoruz. 3 sarti da if ile yazip.
	public int compareTo(X04_Student anotherStudent) {
		if(this.id > anotherStudent.id ) {				// first is greater
			return 1;
		}else if(this.id < anotherStudent.id) {
			return -1;									// second value
		}else {
		return 0;										// equal
		}
	}
//	-----------------------------------------------------	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

//	---------------------------------------------------------------------

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + "]";
	}
	
	
	
	
}
