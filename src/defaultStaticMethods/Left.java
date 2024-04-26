package defaultStaticMethods;

public interface Left
{
	default void m1()
	{
		System.out.println("Default Left Interface Implementation");
	}
}
