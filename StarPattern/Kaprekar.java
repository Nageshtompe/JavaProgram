public class Kaprekar
{
public static void main(String args[])
{
	int num=45;
	
	int sq=num*num;
	
	int num1=sq;
	
	int count=0;
	
	while(num1>0)
	{
		num1=num1/10;
		count++;
	}
	
		if(count%2!=0)
			count++;
		
	count=count/2;
	
	int den=(int)Math.pow(10,count);
	
	int leftPart=sq/den;
	int rightPart=sq%den;
	
	if(leftPart+rightPart==num)
		System.out.println("kaprekar number");
	else
		System.out.println(" not kaprekar number");
}
}