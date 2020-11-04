import java.util.*;
class NumberOfPrimeNumbers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int count=0;
		
		System.out.println("Enter the number of prime numbers you want");
		int n=s.nextInt();
		int i=1;
		while(n>0)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				n--;
				System.out.println(i);
			}
			i++;
		}
	}
}