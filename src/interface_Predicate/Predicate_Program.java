package interface_Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate_Program 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> P=   i -> i>10;
		System.out.println(P.test(100));
		System.out.println(P.test(5));
		
		System.out.println("*****************************");
		
		Predicate<String> P1=   s -> s.length()>5;
		System.out.println(P1.test("Pankaj"));
		System.out.println(P1.test("Ram"));
		
		System.out.println("*****************************");
		
		Predicate<Collection<String>> P3= c -> c.isEmpty();
		ArrayList<String> l = new ArrayList<String>();
		l.add("Pankaj");
		System.out.println(P3.test(l));
		System.out.println(P3.test(new ArrayList<String>()));
	}

}
