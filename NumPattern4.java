
public class NumPattern4 {
	public static void main(String args[])
	{
		int irange=10;
		int jrange=10;
		
		for(int i=2;i<irange;i=i+2)
		{
			for(int j=0;j<jrange;j++)
			{
				if(j-i<=0)
				{
					if(i==j*2)
						System.out.print(" ");
					else
						System.out.print("*");							
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
