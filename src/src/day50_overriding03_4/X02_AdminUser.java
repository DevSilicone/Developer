package day50_overriding03_4;

public class X02_AdminUser extends X01_SlackUser {

	
	public X02_AdminUser(String name) {			// automatic getirdik
		super(name);
	}

	
	@Override
	public void sendAMessage(String message) {
		System.out.println("@Channel");
		System.out.println(getName() + " is sending a message <" + message + ">");
	}
	
	
}
