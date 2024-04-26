package interface_Function;

import java.util.function.Function;

public class Function_Program 
{
	public static void main(String[] args) 
	{
	//Calculate the Length of any String
	Function<String, Integer> f1 = s -> s.length();
	System.out.println(f1.apply("Pankaj"));
	System.out.println(f1.apply("Divyank"));
	
	System.out.println("**************************");
	
	//Calculate the Square of any Integer
	Function<Integer, Integer> f2 = i -> i*i;
	System.out.println(f2.apply(5));
	
	System.out.println("**************************");
	
	//Remove all the Spaces within Any String
	Function<String, String> f3 = s -> s.replaceAll(" ","");
	System.out.println(f3.apply("Pankaj Kumar Gupta"));
	
	System.out.println("**************************");
	
	//Count the number of all the Spaces within Any String
	Function<String, Integer> f4 = s -> s.length() - s.replaceAll(" ","").length();
	System.out.println(f4.apply("Pankaj  Kumar  Gupta Varshney  "));
	}

}
