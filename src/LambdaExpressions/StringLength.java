package LambdaExpressions;

interface interf2
{
public int calculate(String s);	
}

public class StringLength
{
	public static void main(String[] args) 
	{
	interf2 i = s -> s.length();
	System.out.println(i.calculate("Pankaj Gupta"));
	}

}
