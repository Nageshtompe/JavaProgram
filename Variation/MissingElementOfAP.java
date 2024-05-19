package Variation;

public class MissingElementOfAP {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= {2, 4, 8, 10, 12, 14};
		myCode(a,a.length);
	}
	//EndOfMainMethod

	public static void myCode(int[] a,int n) 
	{
		int dif=a[1]-a[0];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		int index=0;
		for (int i = min; i < max; i=i+dif) {

			if(i==a[index++])
			{
				continue;
			}
			else
			{
				System.out.println(i);
				break;
				}
		}			

	}
}



