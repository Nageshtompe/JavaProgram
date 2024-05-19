package Array;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,44,33,22,55,47};
		
		
		for(int i=1;i<a.length;i++)
		{
			
			int temp=a[i];
			int j=i;
			for(;j>0;j--)
			{
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
				}
				else
					break;
			}
			a[j]=temp;
		}
		
		System.out.print(Arrays.toString(a));

	}

}
