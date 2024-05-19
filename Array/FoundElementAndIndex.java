package Array;

public class FoundElementAndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {11,32,44,87,34,76,86};
		int num=86;
		
		int i=0;
		for(;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("found at index "+i);
				break;
			}
		}
		if(i==a.length)
		{
			System.out.println("not found");
		}
			

	}

}
