package Variation;

public class SumOfAllDivisires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
					
				}
			}
			
		}
		System.out.println(sum);

	}

}
