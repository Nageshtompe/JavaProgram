public class PrimeRange
{
	public static void main(String args[])
	{
		for(int j=2;j<=100;j++)
		{
			int num=j;
			int count=0;
		
			for(int i=2;i<num;i++)
			{
				int rem=num%i;
				if(rem==0)
				count++;
			}
				if(count==0)
					System.out.println(num+ "is prime");
				else
				System.out.println(num +" is not prime");
		}
	}
}