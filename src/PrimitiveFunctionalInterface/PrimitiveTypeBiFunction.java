package PrimitiveFunctionalInterface;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;
//import java.util.function.ToLongBiFunction;
//ToLongBiFunction<T, U>

public class PrimitiveTypeBiFunction
{
	public static void main(String[] args) 
	{
	ToIntBiFunction<Integer, Integer> f= (a,b) -> a*b;
	System.out.println(f.applyAsInt(7, 8));
	
	ToDoubleBiFunction<Integer, Integer> f1 = (a,b) -> Math.sqrt(a*b);
	System.out.println(f1.applyAsDouble(40, 11));
	System.out.printf("%.2f",f1.applyAsDouble(40,11));
	
	ToLongBiFunction<Integer, Integer> f2 = (a,b) -> Math.floorDiv(a, b);
	System.out.println("\n"+f2.applyAsLong(100, 24));
	}
}
