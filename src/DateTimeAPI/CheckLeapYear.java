package DateTimeAPI;

import java.time.Year;
import java.util.Scanner;

public class CheckLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year to check");
		int n = sc.nextInt();
	Year y = Year.of(n);
	if(y.isLeap())
		System.out.printf("the given year %d is leap year",n);
	else
		System.out.printf("the given year %d is not leap year",n);
	sc.close();

	}

}
