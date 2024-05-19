package Variation;

public class MinimumEnergy {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= {4, -10, 4, 4, 4};
		int n=a.length;
		myCode(a,n);	
	}
	//EndOfMainMethod

	public static void myCode(int[] a,int n) 
	{


		for (int i = 1; ; i++) {
			int cnt=0;
			int energy=i;
			for (int j = 0; j < a.length; j++) {
				if(energy>0)
				{

					energy=energy+a[j];
					cnt++;
				}
				else
				{
					break;
				}
			}
			if(cnt==a.length)
			{
				System.out.println(i);
				break;
			}
		}

		// write code here
	}

}
