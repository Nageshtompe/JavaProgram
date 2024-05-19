
public class ArmstrongNumber {


	public static void main(String[] args) {


		int n=153;
		int num=n;
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			int temp=(int) Math.pow(rem, 3);
			num=num/10;
			sum=sum+temp;
		}
		if(sum==n)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");
	}
}
