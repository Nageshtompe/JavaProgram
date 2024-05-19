package Array;

public class EqualityArray {
	public static void main(String args[])
	{
		int[] a= {5,10,15,20,25,30};
		
		int[] b= {5,10,15,20,25,30};
		
		String result=equalityOfArray(a,b);
		System.out.println(result);
		
	}

	public static String equalityOfArray(int[] a, int[] b) {
		if(a==null && b==null)
			return "Both are same, null";
		if(a==null && b!=null)
			return "not same";
		if(a!=null && b==null)
			return "not same ";
		
		
		if(a.length != b.length);
			return"not same by length";
			
			
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return "not same";
			}
		}
		
		return "same array";
	}

}
