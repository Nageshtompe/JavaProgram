package Array;


public class Remove1stFrom2nd 
{
	public static void main(String[] args) 
	{
		//array57
		int a[]={1,1,1,3,3,1,6,4,4,8};

		int b[]= {1,3,4};


		for(int i=0;i<b.length;i++)
		{
			
			int num=b[i];
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==num)
					cnt++;
				if(cnt==2)
					break;
			}

			int c[]=new int[a.length-cnt];
			int removeElement=0;
			int index=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=num||removeElement==2) {
					c[index++]=a[j];}
				else
					removeElement++;
			}
			a=c;
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		}

	//EndOfMainMethod		
}

