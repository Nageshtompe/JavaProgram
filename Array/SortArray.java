package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {11,44,55,33,99,77,66,88,22};
		for(int j=0;j<a.length-1;j++)
		{
			for(int i=0;i<a.length-1-j;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
