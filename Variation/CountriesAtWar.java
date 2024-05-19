package Variation;

public class CountriesAtWar {




	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= {2,2};
		int[] b= {5,5};
		myCode(a,b);

	}
	//EndOfMainMethod

	public static void myCode(int[] a,int[] b) 
	{
		int a1=0;
		int b1=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>b[i])
			{
				a1++;
			}
			else
			{
				b1++;
			}
		}
		if(a1>b1)
			System.out.println('A');
		else
			System.out.println('B');// write code here
	}

}


