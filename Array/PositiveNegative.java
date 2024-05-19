package Array;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {11,56,88,-23,65,-28,48,-47};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				//if(a[i]<0 && a[j]>0)		//--------for positive negative
				if(a[i]%2==0&&a[j]%2!=0)	//-------for even odd
					
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
