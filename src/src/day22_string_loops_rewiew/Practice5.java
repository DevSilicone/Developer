package day22_string_loops_rewiew;

public class Practice5 {

	public static void main(String[] args) {
	
		// ### LOOK FOR ERROR ###
		
		String log = ".akd09dsf0errorlakd34$$error;ksfkfdserror%%43klerrorkamdksamdkmerrore3490dre";
		
		// look for error and print count.
		//for loop , substring , if statement
		
		int count = 0;
		
		//error		stop loop 5 character before end
		for(int i = 0; i <= log.length()-5; i++) {
			
			String temp = log.substring(i, i + 5);
			
			//  System.out.println(temp);    =======> belirttigimiz 5 harflileri sira ile basiyor
			
			if (temp.equals("error")) {
				count++;
			}
		}
		
		System.out.println("Count: " + count);
				
	}

}
