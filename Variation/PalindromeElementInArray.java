package Variation;

public class PalindromeElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]a= {111,222,333,444,555};
		
		int count=0;
		int notPresent=0;
		for(int i=0;i<a.length;i++)
		{
			
			int number=a[i];
			int num=number;
			int sum=0;
			
			while(num>0)
			{
				int rem=num%10;
				num=num/10;
				sum=sum*10+rem;
			}
			
			if(sum==number)
				count++;
			else
				notPresent++;
			
			
		}
		if(notPresent!=0)
			System.out.println(0);
		else
			System.out.println(1);
	}

}
