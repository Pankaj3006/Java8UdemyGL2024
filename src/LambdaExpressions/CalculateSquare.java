package LambdaExpressions;

interface interf1
{
public void Square(int i);	
}

public class CalculateSquare 
{
	public static String removeWhiteSpaces(String str){
		String[] getEachWord = str.split(" ");
		String strWithoutSpaces = "";
		for(String word:getEachWord)
		{
			strWithoutSpaces = strWithoutSpaces+word.trim();
		}
        return strWithoutSpaces;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
//	public static void main(String[] args)
//	{
//		interf1 i = s -> System.out.println("The square of the given number "+s+" is: "+ s*s);
//		i.Square(10);
//	}
}
