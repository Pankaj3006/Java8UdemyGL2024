package PrimitiveFunctionalInterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveTypeConsumer 
{
	public static void main(String[] args) 
	{
     IntConsumer c= i -> System.out.println(i*i);
     c.accept(10);
     
     LongConsumer c1= i -> System.out.println(Math.floorDiv(100, i));
     c1.accept(13);
     
     DoubleConsumer c2= i -> System.out.printf("%.3f",Math.sqrt(i));
     c2.accept(10);
	}
}
