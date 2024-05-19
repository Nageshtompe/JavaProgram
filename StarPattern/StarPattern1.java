public class StarPattern1
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i>=2||j>=3)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

//***#####
//***#####
//########
//########
//########
//########
