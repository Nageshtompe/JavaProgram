
public class CharPattern {
	public static void main(String args[])
	{
		int count=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(count+65));
					count++;
				}
			}
			System.out.println();
		}
	}
}
