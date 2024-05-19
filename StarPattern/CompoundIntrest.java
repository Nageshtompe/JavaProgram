public class CompoundIntrest
{
	public static void main(String args[])
	{
		int p=10000;
		int r=5;
		int t=12;
		int n=1;
		
		double n1=1+(r/(n*100.0));
		
		int n2=n*t;
		double amount=p*Math.pow(n1,n2);
		
		System.out.println("compound intrest is :"+" "+amount);
	}
}