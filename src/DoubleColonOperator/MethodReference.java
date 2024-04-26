package DoubleColonOperator;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReference 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f = MethodReference::m1;
		System.out.println(f.apply(10));

		MethodReference t = new MethodReference();
		Predicate<Integer> p = t::m2;
		System.out.println(p.test(23));
	}

	public static int m1(int i) 
	{
		return i * i;
	}

	public boolean m2(int i) 
	{
		return i % 2 == 0;
	}
}
