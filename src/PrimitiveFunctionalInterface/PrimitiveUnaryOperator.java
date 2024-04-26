package PrimitiveFunctionalInterface;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitiveUnaryOperator
{
	public static void main(String[] args) 
	{
		IntUnaryOperator u1 = i-> i*i;
		System.out.println(u1.applyAsInt(20));
			
		LongUnaryOperator u2 = l -> Math.floorDiv(100, l);
		System.out.println(u2.applyAsLong(15));
		
		DoubleUnaryOperator u3 = d-> Math.sqrt(d);
		System.out.printf("%.3f",u3.applyAsDouble(10.5));
	}
}
