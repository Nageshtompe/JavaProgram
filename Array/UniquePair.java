package Array;

import java.util.Arrays;

public class UniquePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,1};
		
		int ori=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
				ori++;
		}
		
		int b[]=new int[ori];
		
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		
		
		a=b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		
		}
	}

}
