package Array;

import java.nio.channels.AcceptPendingException;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{1,2,5},
				{4,7,9},
				{2,9,4}
						};
		int b[][]= {
				{8,5,2},
				{6,0,4},
				{5,3,7}
						};
		
		
		int c[][]=new int [3][3];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		}

	}


