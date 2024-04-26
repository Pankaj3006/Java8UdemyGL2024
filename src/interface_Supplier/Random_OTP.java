package interface_Supplier;

import java.util.function.Supplier;

public class Random_OTP
{
	public static void main(String[] args) 
	{
	Supplier<String> s = () -> 
	{
		String OTP="";
		for(int i=0; i<6; i++)
		{
	    OTP=OTP+(int)(Math.random()*10);
		}
		return OTP;
	
	};
	System.out.println(s.get());
	}

}
