package Array;

public class DuplicateElementRemoveArray {
	public static void main(String args[])
	{
		int []a= {10,10,10,20,20,30,40,40,30,50,50};
		
		int[]b=removeDuplicate(a);
		
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+" ");
	}
		private static int[] removeDuplicate(int[] a)
		{
			
			
			// {10,10,10,20,20,30,40,40,30,50,50};
			int originalCount=0;
			for(int i=0;i<a.length;i++)
			{
				int similarCount=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						similarCount++;
				}
				if(similarCount==0)
					originalCount++;
			}
			
			int[] org=new int[originalCount];
		
			int p=0;
			
			for(int i=0;i<a.length;i++)
			{
				int similarCount=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						similarCount++;
				}
				if(similarCount==0)
					org[p]=a[i];
				p++;
			}
	
		
		return org;
	}

}
