package Array;

public class Covert2DTo1DPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++)
		{
			int []b=a[i];
			
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i]);
			}
			System.out.println();
		}
	}

}
