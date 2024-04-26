package defaultStaticMethods;

public interface Right 
{
	default void m1()
	{
		System.out.println("Default Right Interface Implementation");
	}
}
