package PrimitiveFunctionalInterface;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveTypeBiConsumer 
{
	String name;
	double salary;
	PrimitiveTypeBiConsumer(String name, double salary)
	{
		this.name = name;
		this.salary=salary;
	}
	public String toString()
	{
		return name+" : "+salary;
	}
	public static void main(String[] args) 
	{
	ArrayList<PrimitiveTypeBiConsumer> l = new ArrayList<PrimitiveTypeBiConsumer>();
	populate(l);
    ObjDoubleConsumer<PrimitiveTypeBiConsumer>	c = (e,increment) -> e.salary = e.salary + increment;

    for(PrimitiveTypeBiConsumer e:l)
    {
    	c.accept(e, 477);
    }
    System.out.println(l);
	}
	
	public static void populate(ArrayList<PrimitiveTypeBiConsumer> list)
	{
		list.add(new PrimitiveTypeBiConsumer("Pankaj", 5000));
		list.add(new PrimitiveTypeBiConsumer("Priya", 4000));
		list.add(new PrimitiveTypeBiConsumer("Pooja", 3000));
		list.add(new PrimitiveTypeBiConsumer("Pradeep", 2000));	
	}
}
