package Variation;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = 
			{
					2, 2,1, 1,3, 3 
			}
		;
		int k = 2;
		int n = arr.length;
		myCode(arr,k,n);
	}
	//EndOfMainMethod



	public static void myCode(int arr[], int k, int n) 
	{int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++)
	{
		int cnt=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				cnt++;
			}
		}
		if(cnt==k)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
	}
	System.out.print(min);
	}


}


