
public class NumPattern1 {
	public static void main(String args[])
	{
		int irange=5;
		int jrange=5;
		for(int i=0;i<irange;i++)
		{
			int cnt=1;
			for(int j=0;j<jrange;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt);
					cnt=cnt+2;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
