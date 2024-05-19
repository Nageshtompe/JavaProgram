package Array;

public class FindSameElementIndex {
	public static void main(String args[]) {
		int [] a= {5,10,15,10,25,30};
		
		int num=10;
		
		findIndexOfElementArray(a,num);
	}
	
	public static void findIndexOfElementArray(int [] a,int num)
	{
		int counter=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				counter++;
				System.out.println("found at index "+i);
			}
		}
		if(counter==0)
			System.out.println("not found");
	}
	
}
