package Array;

public class AsendingOrderSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {22,44,55,66,77,88,99,33};
		//22 33 44 55 66 77 88 99 
		
		for(int i=0;i<a.length;i++)
			
		{
			int min=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		}

}
