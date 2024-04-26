package PrimitiveFunctionalInterface;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class PrimitiveBinaryOperator
{
	public static void main(String[] args) 
	{
	IntBinaryOperator b = (i1,i2) -> i1+i2;
	System.out.println(b.applyAsInt(10,20));
	
	LongBinaryOperator b1 = (i1,i2) -> Math.floorDiv(i1, i2);
	System.out.println(b1.applyAsLong(100,24));
	
	DoubleBinaryOperator b2 = (i1,i2) -> Math.sqrt(i1*i2);
	System.out.printf("%.3f",b2.applyAsDouble(10.5,20.5));
	}
}
