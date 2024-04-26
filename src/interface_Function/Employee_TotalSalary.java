package interface_Function;

import java.util.ArrayList;
import java.util.function.Function;

public class Employee_TotalSalary 
{
	String name;
	double salary;
	Employee_TotalSalary(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return name +" : "+ salary;
	}
	public static void main(String[] args) 
	{
	ArrayList<Employee_TotalSalary> l = new ArrayList<Employee_TotalSalary>();
	populate(l);
	System.out.println(l);
	
	Function<ArrayList<Employee_TotalSalary>, Double> f = emp -> 
	{
		double total_Salary=0;
		for(Employee_TotalSalary e:emp)
		{
		total_Salary = total_Salary + e.salary ;
		}
		return total_Salary;		
	};
	
	System.out.println("Total Salary of All Employees are: "+f.apply(l));

	}
	public static void populate(ArrayList<Employee_TotalSalary> list)
	{
	list.add(new Employee_TotalSalary("Pankaj", 3000));
	list.add(new Employee_TotalSalary("Parul", 2000));
	list.add(new Employee_TotalSalary("Priya", 1500));
	list.add(new Employee_TotalSalary("Priyanka", 3500));
	list.add(new Employee_TotalSalary("Arpit", 4000));
	}

}
