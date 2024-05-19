public class CharType
{
	public static void main (String args[])
	{
		char ch='6';
		
		if (ch>='A' && ch<='z')
			System.out.println("capital");
		else if(ch>='a' && ch<='z')
			System.out.println("Small");
		else if (ch>='0' && ch<='9')
			System.out.println("number");
		else
			System.out.println("Somethimg else");
	}
}