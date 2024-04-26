package interface_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie 
{  
	String name;
	String actor;
	String actress;
	Movie(String name, String actor, String actress)
	{
		this.name = name;
		this.actor= actor;
		this.actress = actress;
	}
	public static void main(String[] args) 
	{
		ArrayList<Movie> al = new ArrayList<Movie>();
		populate(al);
	Consumer<Movie> c = m -> 
	{	
		System.out.println("Movie Name: "+m.name);
		System.out.println("Movie Actor: "+m.actor);
		System.out.println("Movie Actress: "+m.actress);
		System.out.println();
	};
	for(Movie m: al)
	{
	c.accept(m);
	}

	}
	public static void populate(ArrayList<Movie> l)
	{
		l.add(new Movie("Bahubali","Prabhas", "Anushka"));
		l.add(new Movie("DDLJ","Shahrukh", "Kaajol"));
		l.add(new Movie("Three Idiots","Aamir", "Kareena"));
		l.add(new Movie("Anand","Amitabh", "Mausmi"));
		l.add(new Movie("Batla house","John", "Sita"));
	}

}
