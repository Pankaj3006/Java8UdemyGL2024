

public class TypeCastingExample {

	public static void main(String[] args) { 
		
		String str= "He@#$&llo!@*";
		String stringHavingAlphabets ="";
		String stringHavingSpecialCharacters ="";
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if((ch[i]>=65 && ch[i]<90) || (ch[i]>=97 && ch[i]<122))
			{
				stringHavingAlphabets = stringHavingAlphabets+ch[i];
			}
			else
			{
				stringHavingSpecialCharacters = stringHavingSpecialCharacters + ch[i];
			}
		}
		
		str = stringHavingAlphabets + stringHavingSpecialCharacters;
		
		System.out.println(str);
	 
		
	}
}
