package Variation;

public class FoundLessThanElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []a= {3,4,6,7,8,2,3,4,6,7,3};
		
		int ele=5;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<ele)
				count++;
		}
		
		System.out.println(count);

	}

}
