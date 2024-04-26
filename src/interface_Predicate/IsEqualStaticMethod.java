package interface_Predicate;

import java.util.function.Predicate;

public class IsEqualStaticMethod
{
	public static void main(String[] args) 
	{
	Predicate<String> p = Predicate.isEqual("Pankaj");
	System.out.println(p.test("Pankaj")); //true
	System.out.println(p.test("Pankaj123")); //false
	}
}
