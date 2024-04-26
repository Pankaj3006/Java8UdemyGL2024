package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class CustiomizedDate 
{
	public static void main(String[] args) 
	{
	LocalDateTime dt = LocalDateTime.of(1995, Month.DECEMBER, 16, 23, 05);
	System.out.println(dt);
	System.out.println("Date after four Months: "+ dt.plusMonths(4));
	System.out.println("Date before four Months: "+ dt.minusMonths(4));
	System.out.println("Date after four hours: "+ dt.plusHours(4));
	
	LocalDate d = LocalDate.of(1995, Month.DECEMBER, 16);
	System.out.println(d);
	System.out.println("Date after four Months: "+ d.plusMonths(4));
	System.out.println("Date before four Months: "+ d.minusMonths(4));
	System.out.println("Date after four hours: "+ d.plusWeeks(4));

	}

}
