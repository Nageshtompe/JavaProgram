package Array;

import java.util.Arrays;

public class HefshineSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {11,44,55,33,99,77,66,88,22};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				else
					break;
				
			}
		}
		 System.out.println(Arrays.toString(a));

	}

}
