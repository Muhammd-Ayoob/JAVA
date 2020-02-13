class Methods
{
	void checkPrime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			table(a);
		}
		else
		{
			checkEven(a);
		}
	}
	void table(int b)
	{
		int tab=1;
		for(int i=1;i<=10;i++)
		{
			tab=b*i;
			System.out.println(i+"*"+b+"="+tab);
		}
	}
	void checkEven(int c)
	{
		if(c%2==0)
		{
			power(c);
		}
		else
		{
			squareRoot(c);
		}
	}
	void power(int d)
	{
		System.out.println(Math.pow(d,4));
	}
	void squareRoot(int e)
	{
		System.out.print(Math.sqrt(e));
	}
	public static void main(String args[])
	{
		Methods m=new Methods();
		m.checkPrime(3);
	}
}