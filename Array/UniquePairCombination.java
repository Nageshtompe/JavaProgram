package Array;

public class UniquePairCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {11,11,22,99,33};
		
		a=removeDuplicate(a);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{

				System.out.println(a[i]+" "+a[j]);
			}
		}

	}

	private static int[] removeDuplicate(int[] a) {
		// TODO Auto-generated method stub
		
		int original=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
				}
			}
			if(count==0)
				original++;
			
		}
		
		int b[]=new int[original];
		
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count==0)
			{
				b[p]=a[i];
				p++;
			}
		}
		return b;
	}
	

}
