public class MaxThree
{
public static void main(String args[])
	{
		int num1=3545;
		int num2=4545;
		int num3=6454;
		
		if(num1>num2 &&num1>num3)
			System.out.println(num1+" greater");
		else if(num2>num1&&num2>num3)
			System.out.println(num2+" greater");
		else
			System.out.println(num3+" greater");
	}
}