package Array;

public class SortArrayAsending {
	public static void main(String args[]) {
		
		
		int[]a= {22,53,65,77,88,33,99,55};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
				
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
