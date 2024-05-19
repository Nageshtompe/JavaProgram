import java.util.Arrays;
public class MaintainInsertionOrderAndMovesZero {
	// StartOfMainMethod
	public static void main(String[] args) 
	{
		int a[] = { 6,3,0,1,8,2,0,0,4,7 };
		// output ={0,0,0,0,3,7,2,5,9};

		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				int temp=a[i];
				for(int j=i;j>0;j--)
				{
					a[j]=a[j-1];
				}
				a[0]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}


