package interface_Predicate;

import java.util.function.Predicate;

public class SoftwareEngineer
{
	String name;
	int age;
	boolean isHavingGf;
	public SoftwareEngineer(String name,int age,boolean isHavingGf)
	{
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) 
	{
	SoftwareEngineer[] list = {new SoftwareEngineer("Pankaj", 32, true),
							   new SoftwareEngineer("Sumit", 23, false),
				               new SoftwareEngineer("Ganesh", 17, false),
				               new SoftwareEngineer("Divyank", 6, true),
				               new SoftwareEngineer("pradeep", 28, true),
				               new SoftwareEngineer("karan", 12, false),
				} ;
	Predicate<SoftwareEngineer> allowed = se -> se.age>=18 && se.isHavingGf == true;
	for(SoftwareEngineer se:list)
	{
		if(allowed.test(se))
			System.out.println(se);
	}

	}

}
