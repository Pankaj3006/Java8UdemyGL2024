package BiFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Employee_Increment
{
	String name;
	double salary;

	public Employee_Increment(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) 
	{
		BiFunction<String, Double, Employee_Increment> f = (n, s) -> new Employee_Increment(n, s);

		ArrayList<Employee_Increment> l = new ArrayList<Employee_Increment>();
		l.add(f.apply("Pankaj", 4000.0));
		l.add(f.apply("Pradeep", 3000.0));
		l.add(f.apply("Pooja", 2000.0));
		l.add(f.apply("Priya", 5000.0));
		l.add(f.apply("Shweta", 6000.0));
		l.add(f.apply("Deepti", 5000.0));

		BiConsumer<Employee_Increment, Integer> c = (e, increment) -> e.salary = e.salary + increment;

		Consumer<Employee_Increment> c1 = e -> 
		{
			System.out.println("Employee Name: " + e.name);
			System.out.println("Employee Salary: " + e.salary);
			System.out.println();
		};

		for (Employee_Increment e : l)
		{
			c.accept(e, 477);
			c1.accept(e);
		}
	}
}
