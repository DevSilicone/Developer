package day44_constructors02;

public class X05_WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	//This () keyword with parenthesis.
	
	public X05_WhatsApp() {
		System.out.println("No-Args constructor");
	}
	
	public X05_WhatsApp(String toNumber, String message) {
		this();										// this() bir usttekini print ediyor // yukariya yazamiyoruz cunku onun da ustunde bir tane daha yok
		System.out.println("2 Args constructor");
		this.toNumber = toNumber;
		this.message = message;
		
	}
	
	public X05_WhatsApp(String toNumber) {
		//toNumber, "[]"				bunlar???
		//this.toNumber = toNumber;
		//this.message = "[]";
		this(toNumber, "[]");
		System.out.println("1 arg constructor");
		
	}
	
	
	
	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
	
	
	
}
