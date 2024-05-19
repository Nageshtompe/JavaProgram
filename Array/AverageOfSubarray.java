package Array;

public class AverageOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a= {5,1,1,1,7,90,20,5,50,40};
		
		
		int k=3;
		int min=Integer.MAX_VALUE;
		
		int minIndex=0;
		
		for(int i=0;i<a.length-k+1;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=a[j];
				
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				minIndex=i;
			}
		}
		
		System.out.println(min);
		System.out.println(minIndex);
		

	}

}
