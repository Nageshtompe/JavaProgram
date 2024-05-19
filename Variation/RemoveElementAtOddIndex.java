package Variation;

public class RemoveElementAtOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="GeeksforGeeks";
		
		
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				s1+=s.charAt(i);
			}
			//else
			//continue;
		}
		System.out.println(s1);
	}

}
