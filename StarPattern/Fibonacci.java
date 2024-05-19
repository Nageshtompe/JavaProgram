public class Fibonacci
{
	public static void main(String args[])
	{
	System.out.print("0,1");
	 int a=0;
	 int b=1;
	 int i=0;
	 
	 while(i<10)
	 {
		int sum=a+b;
		System.out.print(","+sum);
		a=b;
		b=sum;
		i++;
	 }
	}
}