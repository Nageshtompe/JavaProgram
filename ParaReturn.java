
public class ParaReturn {
	public static void main()
	{
		int p=1000;
		int n=2;
		int r=10;
		int t=12;
		
		double abcd=compIntr(p,n,r,t);
		System.out.println(abcd);
	}
	public static double compIntr(int p,int n,int r,int t)
	{
		int b=n*t;
		double a=(1+(r/(t*100.0)));
		double amount=p*Math.pow(a, b);
		return amount;
	}

}
