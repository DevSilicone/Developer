package day41_customclasses02;

public class X08_CapitalOne {
	
	public static void main(String[] args) {
		
		X07_BankAccount acc1 = new X07_BankAccount();		//=> bank account class'tan alip kullandik.
		
		acc1.accountHolder = "Bill Gates";
		acc1.accountNumber = 12345;
		
		acc1.deposit(250);
		acc1.withdraw(100);
		acc1.showBalance();
		
		acc1.charge(50, " wooden spoon");			//=> bank accoun class'a ekledik. sonra burada yazdirdik
		acc1.showBalance();
		
		
		
	}
}
