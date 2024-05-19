package Array;

public class LeaderElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {11,22,99,33,44,88,55,77,66};
		
		for(int i=0;i<a.length;i++)
		{
			
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
					count++;
			}
			if(count==0)
				System.out.print(a[i]+" ");
		}

	}

}
