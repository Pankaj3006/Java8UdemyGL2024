package DateTimeAPI;

import java.time.LocalDateTime;

public class CurrentSystemDateTime
{
	public static void main(String[] args) 
	{
		// DateTime
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int day = dt.getDayOfMonth();
		int month = dt.getMonthValue();
		int year = dt.getYear();
		System.out.printf("Date is = %d-%d-%d",day,month,year);
		System.out.println("\nThe day of the week is: "+ dt.getDayOfWeek());
		System.out.println("The Month is: "+ dt.getMonth());
		int hour = dt.getHour();
		int min = dt.getMinute();
		int sec = dt.getSecond();
		int nano = dt.getNano();
		System.out.printf("Time is = %d:%d:%d:%d",hour,min,sec,nano);
		
	}
}
