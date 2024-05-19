import java.util.Scanner;
public class MenuDriven
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=4)
		{
			System.out.println("1.prime\n2.even\n3.odd\n4.exist\n eneter your choice :");
		choice=sc.nextInt();
			
			
		if(choice==1)
			printPrimeNumber();
		else if(choice==2)
		 System.out.println("even");
		else if(choice==3)
			System.out.println("odd");	
		else if(choice==4)
			System.out.println("tata bye bye khatam !");
		else
			System.out.println("wrong choice");
		}
		
	}
	public static void printPrimeNumber()
	{
		for(int i=1;i<=100;i++)
			printIfPrime(i);
	}
	public static void printIfPrime(int num)
	{
		if(num==1)
			return;
		int count=0;
		
		for(int i=2;i<num;i++)
			if(num%i==0)
				count++;
		if(count==0)
		 System.out.println(num);
	}
}