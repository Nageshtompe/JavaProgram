package Variation;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=465;
		int temp=n;
		
		double sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			sum=sum+Math.pow(rem, 3);
			n=n/10;
		}
		if(sum==temp)
		System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
