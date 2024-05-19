
public class NoparaReturn{
	public static void main()
	{
		
		
		double abcd=compIntr();
		System.out.println(abcd);
	}
	public static double compIntr()
	{
		int p=1000;
		int n=2;
		int r=10;
		int t=12;
		int b=n*t;
		double a=(1+(r/(t*100.0)));
		double amount=p*Math.pow(a, b);
		return amount;
	}

}
