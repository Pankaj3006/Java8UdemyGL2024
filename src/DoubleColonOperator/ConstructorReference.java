package DoubleColonOperator;

public class ConstructorReference
{
	public static void main(String[] args) 
	{
		interf i = sample::new;
		i.get();
	}
}

interface interf 
{
	public sample get();
}

class sample 
{
	public sample()
	{
		System.out.println("Implemented Using Constructor Reference");
	}

}
