package DateTimeAPI;

import java.time.LocalTime;

public class CurrentSystemTime
{
	public static void main(String[] args) 
	{
		// Time
		LocalTime t = LocalTime.now();
		System.out.println(t);
		int hour = t.getHour();
		int minute = t.getMinute();
		int sec = t.getSecond();
		int nano = t.getNano();
		// First Method to print the Time in its Format
		System.out.printf("Time is= %d:%d:%d:%d", hour, minute, sec, nano);
		// Second Method to print the Date in its format
		String owntime = String.format("\nTime: %d=%d=%d=%d", hour, minute, sec, nano); 
		System.out.println(owntime);
	}
}
