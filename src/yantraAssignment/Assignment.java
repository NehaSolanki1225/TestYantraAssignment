package yantraAssignment;

public class Assignment {
	public static void main(String[] args) {
		Assignment a=new Assignment();
		String st="Welcome to Test Yantra";
		System.out.println("reverse String: ");
		//calling and printing the return String of the method for reverse the given String
		System.out.println(a.ReverseTheString(st));
		
		System.out.println("\n"+"Swapped String: ");
		//calling the printing the return String of method for Swapping first and last word in the given String
		System.out.println(a.swapFirstAndLastWord(st));
		
		System.out.println("\n"+"no Duplicate String: ");
		//calling and printing the return String of the method for removing the duplicates in the given String
		System.out.println(a.removeTheDuplicate(st));	
	}
	
	//method for reverse given String
	public String ReverseTheString(String s)
	{
		String rev="";
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	//method for Swapping first and last word in the String
	public String swapFirstAndLastWord(String s)
	{
		String[] stringArray = s.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(int i= 0; i < stringArray.length; i++) 
		{
			sb.append(stringArray[i]+" ");
		}
		String swappedstring=sb.toString();
		return swappedstring;
	}
	
	//method for removing the duplicates in the String
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
		if(count>0)
		{
			withoutDuplicate=withoutDuplicate+s2.charAt(i);
		}
	}
	return withoutDuplicate;
	}
}
