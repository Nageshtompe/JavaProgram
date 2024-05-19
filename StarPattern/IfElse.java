public class IfElse
{
	public static void main(String args[])
	{
		int amountInPocket=566;
		
		if(amountInPocket>5000)
			System.out.println("5star");
		else
		{
			if(amountInPocket>1000)
				System.out.println("MacD");
			else
			{
				if(amountInPocket>500)
					System.out.println("kfc");
				else
				{
					if(amountInPocket>100)
						System.out.println("thali");
					else
						System.out.println("mess");
				}
			}
		}
	}
}