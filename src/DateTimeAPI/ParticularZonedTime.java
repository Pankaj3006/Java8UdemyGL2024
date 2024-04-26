package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ParticularZonedTime 
{
	public static void main(String[] args) 
	{
	ZoneId z = ZoneId.systemDefault();
	System.out.println(z);
	
	System.out.println(LocalDateTime.now());
	ZoneId l= ZoneId.of("America/Los_Angeles");
	ZonedDateTime d = ZonedDateTime.now(l);
	System.out.println(d);

	}

}
