package Array;

public class CopyOfArray {
	public static void main(String args[])
	{
		int [] a= {5,10,15,20,25,30,35};
		
		int [] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		b[1]=100;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
