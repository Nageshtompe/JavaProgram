package Array;

public class SaddlePoint {
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a=
			{
					{
						6,3,9
					}
					,
					{
						9,7,8
					}
					,
					{
						2,4,5
					}
					,
			}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				int myEle=a[i][j];
				boolean smallRow=true;
				for(int k=0;k<a.length;k++)
				{
					if(myEle>a[i][k])
						smallRow=false;
				}
				boolean largeCol=true;
				for(int k=0;k<a.length;k++)
				{
					if(myEle<a[k][j])
						largeCol=false;
				}
				if(smallRow==true&&largeCol==true)
				{
					cnt++;
					System.out.print(myEle);
				}
			}
		}
		if(cnt==0)
			System.out.print("non saddle point");
	}
}


