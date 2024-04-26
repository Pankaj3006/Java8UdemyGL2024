package BiFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Employee 
{
	String name;
	int eno;
	double dailywage;

	Employee(String name, int eno, double dailywage) 
	{
		this.name = name;
		this.eno = eno;
		this.dailywage = dailywage;
	}

	public static void main(String[] args) 
	{
		BiPredicate<Employee, timesheet> p = (e, t) -> e.eno == t.eno;
		
		BiFunction<Employee, timesheet, Double> f = (e, t) ->
		{
			if (p.test(e, t))
				return e.dailywage * t.NoOfdays;
			else
				return 0.0;
		};

		System.out.println(f.apply(new Employee("Divyank", 101, 2500), new timesheet(101, 20)));

	}

}

class timesheet 
{
	int eno;
	int NoOfdays;
	timesheet(int eno, int NoOfdays) 
	{
		this.eno = eno;
		this.NoOfdays = NoOfdays;
	}
}
