package PrimitiveFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveTypeFunction
{
	public static void main(String[] args) 
	{
	IntFunction<Integer> f = i-> i*i;
	System.out.println(f.apply(6));
	
	ToIntFunction<String> f1 = s-> s.length();
	System.out.println(f1.applyAsInt("Pankaj"));
	
	IntToDoubleFunction f2 = i -> Math.sqrt(i);
	System.out.printf("%.3f",f2.applyAsDouble(5));
	System.out.println("\n"+f2.applyAsDouble(5));

	}

}
