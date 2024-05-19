
public class NumberPattern5 {
	public static void main(String args[])
	{
		int num1=1;
		int num2=0;
		for(int i=0;i<5;i++)
		{
			num2=num1;
			num1++;
			for(int j=0;j<5;j++)
			{
				if(j+i<=4)
				{
					System.out.print(num2++);
				}
			}
			System.out.println();
		}
	}

}

