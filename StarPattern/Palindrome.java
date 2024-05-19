public class Palindrome
{
	public static void main(String args[])
	{
		int num1=1211;
		int originalValue=num1;
		int num2=0;
		
		while(num1>0)
		{
			int rem=num1%10;
			num1=num1/10;
			
			num2=num2*10+rem;
		}
		if(originalValue==num2)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}