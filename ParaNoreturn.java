
public class ParaNoreturn {

	public static void main(String args[])
	{
		int p=1000;
		int n=2;
		int r=10;
		int t=12;
		
		compIntr(p,n,r,t);
		
	}
	public static void compIntr(int p,int n,int r,int t)
	{
		
		int b=n*t;
		double a=(1+(r/(t*100.0)));
		double amount=p*Math.pow(a, b);
	
		System.out.println(amount);
	}
}


