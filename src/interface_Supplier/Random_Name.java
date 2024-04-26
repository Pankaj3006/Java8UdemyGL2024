package interface_Supplier;

import java.util.function.Supplier;

public class Random_Name 
{
	public static void main(String[] args) 
	{
	Supplier<String> s = () -> 
	{
		String[] arr = {"Pankaj", "Pradeep", "Gunjan", "Pooja", "Divyank", "Prapti"};
		int x = (int)(Math.random()*6);
		return arr[x];		
	};
    System.out.println(s.get());
	}
}
