package PrimitiveFunctionalInterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitiveTypePredicate
{
	public static void main(String[] args) 
	{
	int[] x = {0,5,10,15,20,25,30};
		
	IntPredicate p = i -> i%2==0;
	for(int x1:x)
	{
		if(p.test(x1))
			System.out.println(x1);
	}
	
	LongPredicate q = l -> Math.floorDiv(1000, l)<=l;
	System.out.println(q.test(30)); //false
	System.out.println(q.test(40)); //true
	
	DoublePredicate r = d-> d%2==0;
	System.out.println(r.test(10.5));
	}
}
