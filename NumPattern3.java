
public class NumPattern3 {
	public static void main(String args[])
	{
		int irange=5;
		int jrange=5;
		
		int cnt=1;
		for(int i=0;i<irange;i++)
		{
			int cnt2=cnt;
			int diff=4;
			for(int j=0;j<jrange;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2+" ");
					cnt2=cnt2+diff;
					diff--;
				}
				else
					System.out.print(" ");
			}
			cnt++;
			System.out.println();
		}
	}
}
