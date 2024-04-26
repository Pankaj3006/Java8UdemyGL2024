package interface_Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication 
{
	String username;
	String password;
	public UserAuthentication(String user, String pass) 
	{
		this.username = user;
		this.password = pass;
	}
	public static void main(String[] args) 
	{
		Predicate<UserAuthentication> p1= u -> u.username.equals("Pankaj");
		Predicate<UserAuthentication> p2= u -> u.password.equals("Gupta");
		//System.out.println(p1.and(p2).test(new UserAuthentication("Pankaj", "Gupta")));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Username");
		String enter_user = sc.next();
		System.out.println("Enter The Password");
		String enter_pass = sc.next();
		UserAuthentication u = new UserAuthentication(enter_user, enter_pass);
		if(p1.and(p2).test(u))
			System.out.println("Valid User");
		else
			System.out.println("Invalid User");
sc.close();
	}

}
