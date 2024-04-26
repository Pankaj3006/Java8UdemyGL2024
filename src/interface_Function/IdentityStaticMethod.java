package interface_Function;

import java.util.function.Function;

public class IdentityStaticMethod 
{
	public static void main(String[] args) 
	{
	Function<String, String> f = Function.identity();
	System.out.println(f.apply("Pankaj"));
	}

}
