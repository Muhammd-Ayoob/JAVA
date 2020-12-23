import java.util.*;

class StringAnagrams
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		boolean bool=false;
		
		System.out.println("Enter two strings whether they are anagrams or not");
		String string1=scanner.next();
		
		String string2=scanner.next();
		
		char array1[]=new char[string1.length()];
		
		char array2[]=new char[string2.length()];
		
		array1=string1.toCharArray();
		
		array2=string2.toCharArray();														
		
		if(string1.length()!=string2.length())
		{
			
			System.out.println("Strings are not anagrams");
		}
		else
		{
			for(int i=0;i<array1.length;i++)
			{
				char tamp='a';
				for(int j=i;j<array2.length;j++)
				{
					if(array1[i]==array2[j])
					{
						tamp=array2[i];
						
						array2[i]=array2[j];
						
						array2[j]=tamp;
						
						bool=true;
						break;
						
					}
					else
					{
						bool=false;
					}
					
				}
				if(bool==false)
					break;
			}
			if(bool)
			{
				System.out.println("Strings are anagrams");
			}
			else
			{
				System.out.println("Strings are not anagrams");
			}
		}
		
		
		
		
		
	}
}