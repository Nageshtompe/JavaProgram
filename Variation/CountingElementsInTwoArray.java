package Variation;


public class CountingElementsInTwoArray 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,7,9,2
		}
		;
		int[] b= 
		{
			0,1,2,1,1,4
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(b[j]<=a[i])
				{
					cnt++;
				}
			}
			System.out.print(cnt+" ");
		}
	}
	//write code here
}

