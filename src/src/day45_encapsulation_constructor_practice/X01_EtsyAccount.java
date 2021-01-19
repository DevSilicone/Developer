package day45_encapsulation_constructor_practice;

import java.util.*;

public class X01_EtsyAccount {

	/*
	 * email
	 * firstName
	 * password
	 * 
	 * getter setter, to string
	 * */
	
	private String email;
	private String firstName;
	private String password;
	
	//constructor 1. No-args. sets all as empty string
	
	public X01_EtsyAccount() {
		email		= "";
		firstName	= "";
		password	= "";
		
	}
	
	// constructor 2
	// takes 3 args and sets them to instance variable
	// using setter
	
	public X01_EtsyAccount(String email, String firstName, String password) {
		//this.email = email;	bu yo ile de yapilabilir
		//this.setEmail(email); bu da oluyor ama hic tercih edilmiyor, bil sadece
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	
//======================================================================================================================	
	/* constructor 3
	 * Email, firstname => call setter methods
	 * password is auto generated and assigned
	 * */
	
	public X01_EtsyAccount(String email, String firstName) {
		 setEmail(email);
		 setFirstName(firstName);
		this.password = getRandomPassword(); // random, password with 6 characters
	}

	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for(int i = 1; i <= 6; i++) {
			rdPassword += letters.charAt(rd.nextInt( letters.length()));
		}
		return rdPassword;
	}
	
	
//======================================================================================================================	
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {	// manual icerik ekledik
		// if it contains @ someWhere in the middle.assign it	// middle da oldugunu indexOf ile bulabiliriz/ ir eill gice you the position
		// if not print "Please enter a valid email adress."
		if(email.indexOf("@")>= 1 && email.indexOf('@')  != email.length()-1 ) {	// "0" > 0 bu sekilde de olur - ('@') < email.length() -1 de diger part icin olabilir
		this.email = email;
		}else {
		System.out.println("Please enter a valid email adress.");
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {	//manual icerik ekledik
		// can't be blank
		// need  to b only Alphabetic / letters
		if(isValidFirstName(firstName)) {			// if ekledik
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
	}
	
	//somradan ekledik getter setter ile otomatic gelmedi
//======================================================================================================================	
	
	/*
	 * valid -> all letters, can have space in middle
	 * invalid -> cannot contain numbers or any other chars
	 * */
	private boolean isValidFirstName(String firstName ) {		// manual condition ekledik
		// check first if it starts with or ends with space
		// return false if true
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {	// kullanici adi girdigimiz kisimda bolluk birkaiyor muyuz gibi check et
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank");				// bunu da sonradan ekledik
			return false;
		}
		
		
		for(int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);			    // %	// good string manupulation - one character one time yaptik
			if(!Character.isAlphabetic(ch) && ch !=' ' ) {	// bosluk ve tek harf olmasin diyoruz
				return false;
			}
			
		}
		return true;
	
//======================================================================================================================		
		
		
	}
	
	public String getPassword() {				
		return password;
	}
	public void setPassword(String password) {						 // en az 6 karakter olacak dedigimizde bunu yapiyoruz
		if(password.length() < 6 ) {
			System.out.println("Must be at least 6 characters. ");
			this.password = "";
	}else {
		this.password = password;
	}
		
	}
	
}
