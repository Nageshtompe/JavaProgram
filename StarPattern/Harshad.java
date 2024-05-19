public class Harshad
{
	public static void main (String args[])
	{
		int num=25;			//sum of number is divisible by number then number is harshad number
		int num2=num;
						//Number 171 is a Harshad Number because 
						//the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9
		int sum=0;
		
		while(num2>0)
		{
			int rem=num2%10;
			sum=sum+rem;
			num2=num2/10;
		}
		if(num%sum==0)
			System.out.println("Harshad number");
		else
			System.out.println("not Harshad Number");
	}
}