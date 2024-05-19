package Array;

public class SecondMaxValueOfArray {
	public static void main(String args[]) {
		
		int a[]= {5,32,6,23,5,432,6,43};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max2&&a[i]!=max)
				max2=a[i];
		}
		
		System.out.println(max);
		System.out.println(max2);
	}

}
