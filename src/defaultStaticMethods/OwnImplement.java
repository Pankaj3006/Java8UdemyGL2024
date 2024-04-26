package defaultStaticMethods;

public class OwnImplement implements Left, Right
{
	public static void main(String[] args)
	{
	OwnImplement i = new OwnImplement();
	i.m1();
	}
	
	public void m1()
	{
		System.out.println("My Own Implementation");
	}

}
