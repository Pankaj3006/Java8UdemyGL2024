package interface_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student_Grades 
{
	String name;
	int marks;
	public Student_Grades(String name, int marks) 
	{
	this.name= name;
	this.marks= marks;
	}
	public String toString()
	{
		return name+" : "+marks;
	}
	public static void main(String[] args) 
	{
	ArrayList<Student_Grades> list = new ArrayList<Student_Grades>();
	list.add(new Student_Grades("Pankaj", 100));
	list.add(new Student_Grades("Parul", 84));
	list.add(new Student_Grades("Priya", 65));
	list.add(new Student_Grades("Priyanka", 30));
	list.add(new Student_Grades("Pranjal", 75));
	list.add(new Student_Grades("Pradeep", 45));
	list.add(new Student_Grades("Pratap", 56));
	System.out.println(list);
	
	Function<Student_Grades, String> f = m -> 
	{
		if(m.marks>=80)
			return "First Class";
		else if(m.marks<=80 && m.marks>=60)
			return "Second Class";
		else if(m.marks<=60 && m.marks>=35)
			return "third Class";
		else
			return "fail";
	};
	Predicate<Student_Grades> p = s -> s.marks>=60;
    for(Student_Grades s: list)
    {
    	if(p.test(s))
    	{
    	System.out.println("Student Name is: " + s.name);
    	System.out.println("Student Marks is: " + s.marks);
    	System.out.println("Student Grade is: " + f.apply(s));
    	System.out.println();
    	}
    }
	}
}
