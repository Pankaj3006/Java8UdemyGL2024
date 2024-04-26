package interface_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveEmptyString
{
	public static void main(String[] args) 
	{
		String[] names = {"Pankaj","","Kavita","","Kirti","Divyank", null};
		Predicate<String> p1 = s ->  s != null;
		Predicate<String> p2 = s ->  s.length()!=0;
		//Predicate<String> p1 = s ->  s != null && s.length()!=0;
		ArrayList<String> l= new ArrayList<String>();
		for(String n: names)
		{
			if(p1.and(p2).test(n))
				l.add(n);
		}
		System.out.println(l);
	}
}
