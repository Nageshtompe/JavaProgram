public class EvenRange
{ 
	public static void main(String[]args)
	{ 
		int start=10;
		int end=30;

		for (int i=start;i<=end;i++)
		{
		System.out.print(i);
		if(i%2==0)
			System.out.println(" even");
		else
			System.out.println(" odd");
		}
	}
}