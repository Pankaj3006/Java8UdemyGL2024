package interface_Supplier;

import java.util.function.Supplier;

public class Random_Password
{
	public static void main(String[] args)
	{
		Supplier<String> s = () -> 
		{
			String pwd = "";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> characters.charAt((int) (Math.random() * 29));

			for (int i = 0; i < 9; i++)
			{
				if(i%2==0)
					pwd = pwd + d.get();
				else
					pwd = pwd + c.get();
			}
			return pwd;
		};
	    System.out.println(s.get());
	}

}
