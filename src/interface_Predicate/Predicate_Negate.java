package interface_Predicate;

import java.util.function.Predicate;

public class Predicate_Negate 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> P1 = i -> i>10;
		Predicate<Integer> P2 = P1.negate();
		System.out.println(P2.test(100));
		System.out.println(P2.test(5));
	}
}
