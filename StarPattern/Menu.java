import java.util.Scanner;

public class Menu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num1 :");
		int num1=sc.nextInt();
		
		System.out.print("enter num2 :");
		int num2=sc.nextInt();
		
		System.out.print("press 1-add 2-sub 3-mul 4-div :");
		int opperation=sc.nextInt();
		
		int result=0;
		if(opperation==1)
			result=num1+num2;
		else if(opperation==2)
			result=num1-num2;
		else if(opperation==3)
			result=num1*num2;
		else if(opperation==4)
			result=num1/num2;
		else
			System.out.println("invalid choice");
		
	System.out.println(result);
		
	}
	
}