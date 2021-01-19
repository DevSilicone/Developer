package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		
		int messages = 10;
		messages++;
		++messages;
		
		System.out.println("Messages: " + messages);
		
		System.out.println("");
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		System.out.println("");
			//11				//11
		int unreadMessages = readMessages--;
		
		System.out.println("UnreadMessages: " + unreadMessages);	//11
		System.out.println("readMesssages: " + readMessages);		//10
		
		System.out.println("");
		
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + readMessages);
		System.out.println("total: " + total);
		
		System.out.println("");
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;
		System.out.println("count: "+count);
		System.out.println("count2: "+count2);
		System.out.println("totalCount: "+totalCount);
		
		System.out.println("");
		
		int myCount = count++ + ++count; // ilk count arti 1 alir, sonra diger count degeri olur ve en son o count da arti 1 alir.
		
		System.out.println("count: " + count);
		System.out.println("myCount: "+ myCount);
		
	}

}
