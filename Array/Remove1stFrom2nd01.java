package Array;

public class Remove1stFrom2nd01 {
	public static void main(String[] args) {
		//basic89

		int a[]={1,1,1,3,3,1,6,4,4,8};

		int b[]= {1,3,4};


		for (int i = 0; i < b.length; i++)
		{
			int c=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(b[i]==a[j])
				{
					c++;
					if(c<3)
						a[j]=0;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=0)
				System.out.print(a[i]+" ");
		}
	}
}



