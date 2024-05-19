public class NumberPattern7 {
	public static void main()
	{
		int num=0;
		for(int i=0;i<9;i++)
		{
			num=1;
			for(int j=0;j<5;j++)
			{
				if(j+i<=4 || j-i<=-4)
				{
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
		}
	}

}
