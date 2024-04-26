package interface_Function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserAuthentication
{
	String username;
	String password;
	public UserAuthentication(String user, String password) 
	{
	this.username = user;
	this.password = password;
	}
	public static void main(String[] args) 
	{
	Function<String, String> f1 = s -> s.toUpperCase();
	Function<String, String> f2 = s -> s.substring(0, 6);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The username");
	String user = sc.next();
	System.out.println("Enter the Password");
	String pwd = sc.next();
	Predicate<UserAuthentication> p = u -> u.username.equalsIgnoreCase("pankaj") && u.password.equals("gupta");
	
	if(p.test(new UserAuthentication(f1.andThen(f2).apply(user), pwd)))
	{  
		System.out.println("Valid user");
	}
	else
	{
		System.out.println("Invalid User");
	}
	
	
	sc.close();

	}

}
