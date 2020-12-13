class ArrayCopyInReverse
{
	public static void main(String args[])
	{
		Integer array1[]={1,2,3,4,5,6,7,8,9,10};
		
		Integer array2[]=new Integer[array1.length];
		
		
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[(array1.length-i)-1];
		}
		
		for(int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i]+" ");
		}
	}
}