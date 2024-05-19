public class StarPattern11
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<20;j++)
			{
				if(j==2 || j==14||j-i==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
}