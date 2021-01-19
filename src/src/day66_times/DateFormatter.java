package day66_times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		
		// Date Formatter example
		LocalDate date = LocalDate.of(2020, 12, 8);
		System.out.println(date);
		
		
		// 1 way
																//burasi a=buyuk ve kucuk duyarli olmak zorunda hata veriyor yoksa
		String dateStr = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy Q G"));	//-> Q yilin ceyregini gosteriyor -> AD or BC ->// milattan once, milattan sonra
		System.out.println(dateStr);
		
		// BC -> before christ ?
		// AD -> 
		
		
		
		// 2 Way
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE, MM/dd/yyyy");
		
		String formattedDate = date.format(dateTimeFormatter);
		
		System.out.println(formattedDate);
		

	}

}
