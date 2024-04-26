package PrimitiveFunctionalInterface;

import java.util.function.UnaryOperator;

public class SimpleUnaryOperator 
{
	public static void main(String[] args) 
	{
	UnaryOperator<Integer> u = i-> i*i;
	System.out.println(u.apply(10));
	}
}
