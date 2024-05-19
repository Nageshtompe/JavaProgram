package Variation;

public class SmallestNumberVariation {
	//StartOfMainMethod
	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 3, 1 };
		int k = 2;
		int n = arr.length;
		myCode(arr,k,n);
	}
	//EndOfMainMethod

	public static void myCode(int arr[], int k, int n) 
	{int smallEle=Integer.MAX_VALUE;
	int ans=0;
	for (int i = 0; i < arr.length; i++) {
		int d=0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				d++;
			}
		}
		if(d==k)
		{
			if(arr[i]<smallEle)
			{
				ans=arr[i];
			}
		}
	}
	System.out.println(ans);
	}
}

