import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			int rem=num%i;
			if(rem==0)
				count++;
		}
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}