package StreamsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBasedOnLength
{
	public static void main(String[] args) 
	{
    List<String> l = new ArrayList<String>();
    l.add("PankajGupta");
    l.add("Pradeep");
    l.add("Gunjan");
    l.add("Pooja");
    l.add("Divyank");
    l.add("PraptiGupta");
    System.out.println(l);
    
    System.out.println(l.stream().filter(s-> s.length()>=9).collect(Collectors.toList()));
    System.out.println(l.stream().filter(s-> s.length()>=9).count());
    System.out.println(l.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
    

	}
}
