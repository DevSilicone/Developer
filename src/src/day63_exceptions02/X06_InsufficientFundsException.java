package day63_exceptions02;

public class X06_InsufficientFundsException extends RuntimeException {
	
	public X06_InsufficientFundsException(){
		
	}
	
	public X06_InsufficientFundsException(String message) {
		super(message);
	}

}
