package day63_exceptions02;
//CUSTOM UNCHECKED EXCEPTION. EXTENDS RUNTIME EXCEPTION
public class X07_CustomExceptionTest {

	public static void main(String[] args) throws X08_NeedSomeCoffeeException {
		
		double balance = 2000;
		double transcation = 210;
		
		if(transcation > balance) {
//			throw new InsufficientFundsException();
			throw new X06_InsufficientFundsException("Balance is too low.");
		}else {
			System.out.println("Purchase succesfull.");
			balance -= transcation;
		}
		
		throw new X08_NeedSomeCoffeeException("getting sleepy");
		
		
		
	}

}
