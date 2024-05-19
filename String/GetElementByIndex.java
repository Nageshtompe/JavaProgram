package String;

public class GetElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcabcd";
		int index=4;
		
		char [] c=s1.toCharArray();		
		
		for(int i=0;i<c.length;i++)
		{
			if(i==index)
			{
				System.out.println(c[i]);
			}
			
		}
		
		
		
	}

}
