package Array;

import java.util.Arrays;

public class InterleavingArray {
	
	
	public static void main(String args[])
	
	{
		
		char []a= {'a','b','c','d'};
		char b[]= {'w','x','y','z'};
		
		char c[]=new char[a.length+b.length];
		int index=0;
		
		for(int i=0;i<a.length ||i<b.length;i++)
		{
			if(i<a.length)
			{
				c[index]=a[i];
				index++;
				
			}
			
			if(i<b.length)
			{
				c[index]=b[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
