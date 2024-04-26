package interface_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee_SalaryIncrement 
{
	String name;
	double salary;

	Employee_SalaryIncrement(String name, double salary) 
	{
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return name + " : " + salary;
	}

	public static void main(String[] args) 
	{
		ArrayList<Employee_SalaryIncrement> l = new ArrayList<Employee_SalaryIncrement>();
		Employee_SalaryIncrement.populate(l);
		System.out.println("Before Salary Increment" + l);

		Predicate<Employee_SalaryIncrement> p = emp -> emp.salary <= 2500;

		Function<Employee_SalaryIncrement, Employee_SalaryIncrement> f = emp -> 
		{
			emp.salary = emp.salary + 477;
			return emp;
		};

		ArrayList<Employee_SalaryIncrement> l2 = new ArrayList<Employee_SalaryIncrement>();
		for (Employee_SalaryIncrement e : l)
		{
			if (p.test(e))
				l2.add(f.apply(e));
		}
		System.out.println("After Salary Increment" + l);
		System.out.println("Those Employees for whom salary got increased" + l2);

	}

	public static void populate(ArrayList<Employee_SalaryIncrement> list)
	{
		list.add(new Employee_SalaryIncrement("Pankaj", 3000));
		list.add(new Employee_SalaryIncrement("Parul", 2000));
		list.add(new Employee_SalaryIncrement("Priya", 1500));
		list.add(new Employee_SalaryIncrement("Priyanka", 3500));
		list.add(new Employee_SalaryIncrement("Arpit", 1000));
	}
}
