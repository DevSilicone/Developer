package day44_constructors02;
import java.util.*;

public class X02_Dice {

	public static void main(String[] args) {
		
		// burasi komple diger tarafta ilk yazdigimiz yeri cagiriyor
		X01_Job job1 = new X01_Job();											//=> its calling the constructer, diger tarafta ilk olani buraya cagirmis oluyor
		X01_Job job2 = new X01_Job("Java Developer");
		X01_Job job3 = new X01_Job("SDET", "Amazon", 130_000.0);//=> you can put underscor ama print ettiginde gostermiyor.
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
System.out.println("******************************************************************************");		
		
		// create LIST OF JOBS and add 5 different jobs with company, salary, title
		List<X01_Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new X01_Job("Scrum Master", "Google", 123000));
		jobsList.add(new X01_Job("SDET" , "FreddieMac" , 100000));
		jobsList.add(new X01_Job("BA", "Leidos" , 98000));
		jobsList.add(new X01_Job("Senior QA Tester" , "Delta" , 150_000));
		
		System.out.println(jobsList); // diger tarafa yazip string olandan cagirdigimiz	(string var gibi dusun) 
										// sadece bunu koydugun an hepsini yazdirir bu sefer.

		System.out.println(jobsList.toString());
		
System.out.println("******************************************************************************");			
		
		//find the highest paying job and print toString for that
		double maxSalary = 0;
		int highestIndex = -1;
		
		for(int i = 0; i < jobsList.size(); i++) {
			if(jobsList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		X01_Job bestJob = jobsList.get(highestIndex);							// bu ve alttaki ayni print yapiyor.
		System.out.println("Highest Salary" + jobsList.get(highestIndex));


	}

}
