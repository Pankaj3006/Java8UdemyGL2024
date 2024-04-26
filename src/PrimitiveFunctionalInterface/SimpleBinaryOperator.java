package PrimitiveFunctionalInterface;

import java.util.function.BinaryOperator;

public class SimpleBinaryOperator 
{
	public static void main(String[] args) 
	{
	BinaryOperator<String> b = (s1,s2)-> s1+s2;
	System.out.println(b.apply("Pankaj","Gupta"));
	
	BinaryOperator<Integer> b1 = (s1,s2)-> s1+s2;
	System.out.println(b1.apply(10, 20));
	}
}
