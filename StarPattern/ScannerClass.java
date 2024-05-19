import java.util.*;
public class ScannerClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number :");
		Int number=sc.nextInt();
		
		if(number>=35)			//if(result) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
