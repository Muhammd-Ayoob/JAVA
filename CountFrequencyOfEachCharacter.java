import java.util.*;
class CountFrequencyOfEachCharacter
{
	
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter any string");
	String s1=s.next();
	
	char ch[]=new char[s1.length()];
	
	int count=1;
	
	int count2=0;
	
	
	//Loop for storing string into character array:
	for(int i=0;i<s1.length();i++)	
	{
		ch[i]=s1.charAt(i);
	}
	
	//Loop for manage array in an ordered manner like word "karakari" as "kkrraaai"
	for(int i=0;i<ch.length;i++) 
	{
		for(int j=i+1;j<ch.length;j++)
		{									
			if(ch[i]==ch[j])
			{
				char a=ch[i+1];
				
				ch[i+1]=ch[j];
				
				ch[j]=a;
			}
		}
	}
	
	
	//printing characters and counting the number of existance of character
	for(int i=0;i<ch.length;i++)	
	{	
		int count1=1;
												
		char a=ch[i];
		
		for(int j=i+1;j<ch.length;j++)
		{
			
			if(ch[i]==ch[j])
			{
			
				count1++;
				
			}
			
		}
		count2=count2+count1;
		
		i=count2-1;
		
		System.out.println(a+" is present "+count1+" times "+" in the word you entered");
		
		}
	
	}
}