package Array;

public class AddingTwoArray {
	public static void main(String args[]) {
		
		int []a= {11,33,55,77,99};
		
		int []b= {22,44,66};
		
		int []c=new int[a.length+b.length];
		
		int j=0;
		for(int i=0;i<a.length||i<b.length;i++)
		{
			if(i<a.length)
			{
				c[j]=a[i];
				j++;
			}
			if(i<b.length)
			{
				c[j]=b[i];
				j++;
			}
			
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
	}

}
