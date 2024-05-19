package Array;

public class CountEvenIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,4},{4,3,7,5,8,4},{7,8,9}};
		
		
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
