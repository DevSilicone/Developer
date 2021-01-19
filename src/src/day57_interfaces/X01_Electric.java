package day57_interfaces;

public interface X01_Electric {

	public static final boolean HAS_BATTERIES = true;
	int MAX_BATTERIES = 100_000;						//=> this is still public static final (automaticly comes)
	
	
	public abstract void charge();						//=> burada da public ve abstract kaldirsan da ayni calisir, otomatik algiliyor
	
	
	
}
