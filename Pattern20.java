
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int count1=5;
		int count2=0;
		int count3=5;
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<count1;j++)
			{
				System.out.print("*");
			}
			count1--;
			
			
			for(int j=0;j<count2;j++)
			{
				System.out.print(" ");
			}
			count2=count2+2;
			
			for(int j=0;j<count3;j++)
			{
				System.out.print("*");
			}
			count3--;
			
			System.out.println();
			
			
			count1=2;
			count2=6;
			count3=2;
			
		
				for(int j=0;j<count1;j++)
				{
					System.out.print("*");
				}
				count1++;
				
				
				for(int j=0;j<count2;j++)
				{
					System.out.print(" ");
				}
				count2=count2-2;
				
				for(int j=0;j<count3;j++)
				{
					System.out.print("*");
				}
				count3;
				
				System.out.println();

			
		}

	}

}
