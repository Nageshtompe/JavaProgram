
public class LengthOfLongestSubarray {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
			{
					2, 3, 4, -1, -2, 1, 5, 6, 3
			};
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod
	public static void myCode(int[] a,int n) 
	{
		int max=Integer.MIN_VALUE;
		for(int j=0;j<a.length;j++)
		{
			int cnt=0;
			for(int i=j;i<a.length;i++)
			{
				if(a[i]>0)
				{
					cnt++;
				}
				else
				{
					break;
				}
			}
			if(cnt>max)
			{
				max=cnt;
			}
		}
		System.out.print(max);
		// write code here
	}
}


