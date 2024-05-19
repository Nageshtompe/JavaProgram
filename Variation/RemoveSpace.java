package Variation;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="  db gn sj   s";  //dbgnsjs
		
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}

		}
		System.out.println(s1);

	}

}
