package Array;


// Binary search program 
// not insertion


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {23,45,67,88,90};
		
		int start=0;
		int end=a.length-1;
		
		int ele=90;	
		while(start<=end)
		{
			
			int mid=(start+end)/2;
			if(a[mid]==ele)
			{
				System.out.println("found at index:"+ mid);
				break;
			}
			else if(ele>a[mid])
				start=mid+1;
			else 
				end=mid-1;
			
				
		}
		if(start>end)
				System.out.println("element not found");
		
			
	}

}
