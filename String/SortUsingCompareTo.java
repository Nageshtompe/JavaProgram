package String;

import java.util.Arrays;

public class SortUsingCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []a={"hi","welcome","to","hefshine"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				String s1=a[i];
				String s2=a[j];
				
				if(s1.compareTo(s2)>0)
				{
					
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
			}	
		}
		System.out.println(Arrays.toString(a));
	}
}
