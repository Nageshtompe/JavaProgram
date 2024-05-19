package Array;

public class MyStack {

	private int a[]=new int[5];
	private int p=0;
	
	
	public void push(int num)
	{
		if(p>=a.length)
		{
			System.out.println("Stack is fool");
		}
		else
		{
			a[p]=num;
			p++;
		}	
	}
	
	public int pop()
	{
		if(p==0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			p--;
			return a[p];
		
		}
	}
	
	public void print()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
