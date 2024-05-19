public class Swaping 
{
	public static void main(String args[])
	{
		num1=5;
		num2=6;
		swap(num1,num2);
	}
	public static void swap(num1,num2)
	{
		System.out.println(num1+" "+num2);
		num3=num1;
		num2=num1;
		num2=num3;
		System.out.println(num1+" "+num2);
	}
}


//without using thired variable
//num1=num1+num2;
//num2=num1-num2;
//num1=num1-num2;
//--------------or--------------
//num1=num1*num2;
//num2=num1/num2;
//num1=num1/num2;