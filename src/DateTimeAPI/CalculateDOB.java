package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateDOB 
{
	public static void main(String[] args) 
	{
		LocalDate birthDate = LocalDate.of(1989, Month.JUNE, 30);
		System.out.println(birthDate);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDate, today);
		System.out.printf("The Age is: %d years %d months %d Days",p.getYears(), p.getMonths(), p.getDays());
		System.out.println("\nThe age is: "+p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
		LocalDate deathDate = LocalDate.of(1989+62, Month.JUNE, 30);
		System.out.println(deathDate);
		Period p1 = Period.between(today, deathDate);
		System.out.println("The Remaining days are: "+(p1.getYears()*365+p1.getMonths()*30+p1.getDays())+" Days");
	}
}
