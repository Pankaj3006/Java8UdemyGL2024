package interface_Consumer;

import java.util.function.Consumer;

public class Consumer_Chaining 
{
	String name;
	String result;

	public Consumer_Chaining(String name, String result)
	{
		this.name = name;
		this.result = result;
	}

	public static void main(String[] args)
	{
		Consumer<Consumer_Chaining> c1 = m -> System.out.println("Movie: " + m.name + " is Ready to Release");
		Consumer<Consumer_Chaining> c2 = m -> System.out
				.println("Movie: " + m.name + " is just Released and it is: " + m.result);
		Consumer<Consumer_Chaining> c3 = m -> System.out
				.println("Movie: " + m.name + " has been stored with its result");
		Consumer<Consumer_Chaining> c_chained = c1.andThen(c2).andThen(c3);

		Consumer_Chaining ch = new Consumer_Chaining("Bahubali", "Hit");
		c_chained.accept(ch);
	}
}
