package interface_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student 
{
	String name;
	int marks;
	String grades;
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args) 
	{
		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		
		Predicate<Student> p= s-> s.marks>=60;
		
		Function<Student, String> f= s -> 
		{
			if(s.marks>=80)
				return "A";
			else if(s.marks <80 && s.marks>=70)
				return "B";
			else if(s.marks <70 && s.marks>=60)
				return "C";
			else if(s.marks <60 && s.marks>=45)
				return "D";
			else 
				return "E";			
		};
		
		Consumer<Student> c = s ->
		{
		System.out.println("Student name: "+s.name);
		System.out.println("Student marks: "+s.marks);
		System.out.println("Student Grades: "+f.apply(s));
		System.out.println();
		};
		
		for(Student s: l)
		{
			if(p.test(s))
				c.accept(s);
		}

	}
	
	public static void populate(ArrayList<Student> list)
	{
		list.add(new Student("Pankaj", 100));
		list.add(new Student("Parul", 84));
		list.add(new Student("Priya", 65));
		list.add(new Student("Priyanka", 30));
		list.add(new Student("Pranjal", 75));
		list.add(new Student("Pradeep", 45));
		list.add(new Student("Pratap", 56));
	}

}
