package day50_overriding03_4;

public class X03_SlackChannel {
	
	public static void main(String[] args) {
		
		X01_SlackUser su = new X01_SlackUser("Nadia");
		X02_AdminUser au = new X02_AdminUser("Florian");
		
		su.sendAMessage("This Thursday, we will summarize Jira Xray plug in / add on");
		au.sendAMessage("Thank you");
		
	}

}
