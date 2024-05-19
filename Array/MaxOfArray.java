package Array;

public class MaxOfArray {
	public static void main(String args[])
	{
		int []a= {5,3,7,2,8,10};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println(max);
	}

}
