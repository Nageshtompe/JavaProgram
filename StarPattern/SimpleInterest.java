public class SimpleInterest
{
	public static void main(String args[])
	{
		int p=10000;
		int n=2;
		int r=10;
		abcd(p,n,r);
	}
	public static void abcd(int p,int n,int r)
		{
			int simpleInterest=p*n*r/100;
			System.out.println(simpleInterest);
		}
}