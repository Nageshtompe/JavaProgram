
public class NumberPattern3 {
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i<=4)
					System.out.print(1+i+j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
/*
12345
2345 
345  
45   
5  */  
