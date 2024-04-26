package interface_Predicate;

import java.util.function.Predicate;

public class NameStartWithK
{
	
	public static void main(String[] args) 
	{
    String[] names = {"Pankaj","Kajal","Kavita","Keenu","Kirti","Divyank"};
	Predicate<String> startsWithK = s -> s.charAt(0)=='K';
	for(int i=0;i<names.length; i++)
	{
	Display(startsWithK,names[i]);
	}

	}
	
	public static void Display(Predicate<String> p,String s)
	{
		if(p.test(s))
			System.out.println(s);
		
	}

}
