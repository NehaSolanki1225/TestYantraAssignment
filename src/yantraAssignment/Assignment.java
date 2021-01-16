package yantraAssignment;

public class Assignment {
	public static void main(String[] args) {
		Assignment a=new Assignment();
		String st="Welcome to Test Yantra";
		System.out.println(a.ReverseTheString(st));
		a.swapFirstAndLastWord(st);
		System.out.println();
		System.out.println(a.removeTheDuplicate(st));
		
	}
	
	public String ReverseTheString(String s)
	{
		String rev="";
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	public void swapFirstAndLastWord(String s)
	{
		String[] splitString = s.split(" ");
		String first=splitString[0];
		String last =splitString[splitString.length-1];
		
		splitString[0]=last;
		splitString[splitString.length-1]=first;
		
		for(String wd:splitString)
		{
			System.out.print(wd + " ");
		}		
	}
	
	public String removeTheDuplicate(String s)
	{
	String s1=s.toLowerCase()	;
	String s2=s1.replace(" ","");
	
	String withoutDuplicate="";
	for(int i=0; i<s2.length(); i++)
	{
		int count=0;
		char c1 = s2.charAt(i);
		for(int j=0; j<s2.length(); j++)
		{
			char c2 = s2.charAt(j);
			if(c1==c2 && i>j)
			{
				break;
			}
			if (c1==c2)
			{
				count++;
			}
		}
		if(count==1)
		{
			withoutDuplicate=withoutDuplicate+s2.charAt(i);
		}
	}
	return withoutDuplicate;
	}
}
