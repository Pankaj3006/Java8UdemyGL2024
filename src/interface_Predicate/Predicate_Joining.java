package interface_Predicate;

import java.util.function.Predicate;

public class Predicate_Joining
{
	public static void main(String[] args) 
	{
		Predicate<Integer> P1 = i -> i>10;
		Predicate<Integer> P2 = i -> i%2==0;
		System.out.println(P1.and(P2).test(45));//false
		System.out.println(P1.or(P2).test(45));//true
		System.out.println(P1.and(P2).test(44));//true
		System.out.println(P1.or(P2).test(44));//true
	}
}
