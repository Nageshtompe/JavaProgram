package Array;

public class LeastOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {33,7,90,20,5,50,40};
		int j=3;
		int minAvg=Integer.MAX_VALUE;
		int startIndex=0;
		for(int i=0;i<=a.length-j;i++)
		{
			int sum=0;
			for(int k=i;k<i+j;k++)
			{
				sum=sum+a[k];
				
			}
			int avg=sum/j;
			if(avg<minAvg)
			{
				minAvg=avg;
				startIndex=i;
			}

		}
		System.out.println(minAvg);
		System.out.println(startIndex);

	}

}
