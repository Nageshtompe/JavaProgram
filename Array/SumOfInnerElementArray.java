package Array;

public class SumOfInnerElementArray {
	public static void main(String args[]) {
		int [][]a= {{1,2,3,4,5,3},
					{4,2,3,1,8,6},
					{7,3,5,1,5,4},
					{2,2,4,3,5,2}};
		
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i!=0 && i!=a.length-1 && j!=0 && j!=a[i].length-1)
				sum=sum+a[i][j];
		}
	}
	System.out.println(sum);
	}
}

