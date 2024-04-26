package PrimitiveFunctionalInterface;

import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveTypeSupplier
{
	public static void main(String[] args) 
	{
		IntSupplier s = () -> (int)(Math.random() * 10);
		String OTP = "";
		for (int i = 1; i <= 6; i++)
		{
			OTP = OTP + s.getAsInt();
		}
		System.out.println(OTP);
		
		DoubleSupplier s1=()-> Math.random()*10;
		System.out.printf("%.3f",s1.getAsDouble());
	   
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the first Number");
		long l1 = sc.nextLong();
		System.out.println("Enter the Second Number");
		long l2= sc.nextLong();
				
		LongSupplier s2 = ()-> Math.floorDiv(l1, l2);
		System.out.println(s2.getAsLong());
		sc.close();
	}
}
