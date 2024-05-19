
public class minsumoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find a Pair Whose Sum is Closest to zero in Array
		// Given array of +ve and -ve integers ,we need to find a pair whose sum is closed to Zero in Array.
		// array[]={1,3,-5,7,8,20,-40,6};   
		//The pair whose sum is closest to zero :  -5 and 6

		
		int a[]= {1,3,-5,7,8,20,-40,6,-1,1};
		
		int fmin=0;
		int smin=0;
		
		
	
		for(int i=0; i<a.length; i++) {
			int min=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]+a[j]==min) {
					
					fmin=a[i];
					smin=a[j];	
				}
				
				
			}
			
			//System.out.println(count);
			
		}
		System.out.println(smin+" "+fmin);
		

	}

}
