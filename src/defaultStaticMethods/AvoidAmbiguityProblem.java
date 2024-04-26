package defaultStaticMethods;

public class AvoidAmbiguityProblem implements Left, Right 
{
	public static void main(String[] args) 
	{
	AvoidAmbiguityProblem a= new AvoidAmbiguityProblem();
	a.m1();
	}
	
	public void m1()
	{
		Left.super.m1();
		Right.super.m1();
	}

}
