package interface_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee 
{
	String name;
	String designation;
	double salary;
	String city;	
	Employee(String name, String designation, double salary, String city)
	{
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	this.city = city;
	}
	public String toString()
	{
		String s = String.format("(%s,%s,%.2f,%s)", name,designation,salary,city);
		return s;
	}
	public static void display(Predicate<Employee> p, ArrayList<Employee> l)
	{ 
		for(Employee e: l)
		{
		if(p.test(e))
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
	ArrayList<Employee> list = new ArrayList<Employee>();	
	list.add(new Employee("Pankaj","Manager", 130000, "Jattari"));
	list.add(new Employee("Anurag","Developer", 40000, "Delhi"));
	list.add(new Employee("Dilip","Developer", 50000, "Noida"));
	list.add(new Employee("Pradeep","Tester", 60000, "Bangalore"));
	list.add(new Employee("Chetan","Analyst", 70000, "Jattari"));
	list.add(new Employee("Saurabh","Analyst", 80000, "Delhi"));
	list.add(new Employee("Gunjan","Tester", 90000, "Noida"));
	list.add(new Employee("Sumit","Developer", 20000, "Bangalore"));
	list.add(new Employee("Hina","Analyst", 30000, "Bombay"));
	list.add(new Employee("Raj","Tester", 10000, "Delhi"));
	list.add(new Employee("Priya","Tester", 20000, "Noida"));
	list.add(new Employee("Deepak","Developer", 50000, "Delhi"));
	list.add(new Employee("Anjali","Analyst", 60000, "Noida"));
	list.add(new Employee("Priyanka","Manager", 70000, "Bangalore"));
	//System.out.println(list);
	
	Predicate<Employee> p1= e -> e.designation.equals("Manager");
	display(p1, list);
	System.out.println("**************************************");
	Predicate<Employee> p2= e -> e.city.equals("Jattari");
	display(p2, list);
	System.out.println("**************************************");
	Predicate<Employee> p3= e -> e.salary<=40000;
	display(p3, list);
	System.out.println("**************************************");
	display(p2.and(p1), list);
	System.out.println("**************************************");
	display(p1.or(p3), list);
	System.out.println("**************************************");
	display(p2.negate(), list);
	}

}
