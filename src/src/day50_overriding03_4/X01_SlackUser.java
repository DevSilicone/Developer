package day50_overriding03_4;

public class X01_SlackUser {

	private String name;
	
	
	public X01_SlackUser(String name) {
		this.name = name;
	}
	
	
	public void sendAMessage(String message) {
		System.out.println(name + " is sending a message <" + message + ">");
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
