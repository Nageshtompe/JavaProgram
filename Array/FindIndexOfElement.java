package Array;

public class FindIndexOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,10,15,20,25,30};
		
		int num=35;
		
		int index=findIndexOfElementInArray(a,num);
		
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println("found at index "+index);
	}
	
	public static int findIndexOfElementInArray(int a[],int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				return i;
		}
		
		return -1;
	}

}
