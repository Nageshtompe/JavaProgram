package Variation;

public class MagicalElement
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int low=1;
		int high=10;
		int arr[]= 
		{
			-10,-1, 0, 3, 10, 11, 30, 50, 100, 150
		}
		;
		myCode(arr,low,high);
	}
	//EndOfMainMethod
	public static void myCode(int arr[], int low, int high) 
	{
		int i=0;
		for(;i<arr.length;i++)
		{
			if(i==arr[i])
			{
				System.out.print(arr[i]);
				break;
			}
		}
		if(i==arr.length)
		System.out.print(-1);
	}
}
