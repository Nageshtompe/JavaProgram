import java.util.Scanner;
public class TableLoop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value for table :");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}
}