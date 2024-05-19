public class DaysYear
{
	public static void main(String args[])
	{
		int num=1000;
		int years=num/365;
		
		int remainingDaysAfterYear=num%365;
		int month=remainingDaysAfterYear/30;
		
		int remainingDaysAfterMonth=remainingDaysAfterYear/30;
		int weeks=remainingDaysAfterMonth/7;
		
		int days=remainingDaysAfterMonth%7;
		
		System.out.println(years+" "+month+" "+weeks+" "+days);
	}
}