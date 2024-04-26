package BiFunctionalInterface;

import java.util.function.BiFunction;

public class Student
{
	String name;
	int rollno;
	Student(String name, int roll)
	{
		this.name= name;
		this.rollno = roll;
	}
	public String toString()
	{
		return name+" : "+ rollno;
	}

	public static void main(String[] args)
	{
	BiFunction<String, Integer, Student> f=(a,b) -> new Student(a,b);
	System.out.println(f.apply("Pankaj",100));
	System.out.println(f.apply("Priya",200));
	}

}
