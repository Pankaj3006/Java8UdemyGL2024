package DateTimeAPI;

import java.time.LocalDate;

public class CurrentSystemDate 
{
	public static void main(String[] args) 
	{
		//Date
		LocalDate d = LocalDate.now();
		System.out.println(d);
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getMonthValue());
		System.out.println(d.getYear());
		System.out.println(d.getDayOfYear());
		System.out.println(d.getDayOfWeek());
		//Print the Date in own format
		int day = d.getDayOfMonth();
		int month = d.getMonthValue();
		int year = d.getYear();
		//First Method to print the Date in its format
		System.out.printf("Date is: %d-%d-%d",day,month,year); 
		//Second Method to print the Date in its format
		String owndate = String.format("\nDate: %d-%d-%d",day,month,year); 
		System.out.println(owndate); 
		
		 
		
		
		
	}

}
