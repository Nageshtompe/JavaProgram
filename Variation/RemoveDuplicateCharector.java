package Variation;

public class RemoveDuplicateCharector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="computer";
		String s1="cat";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			String temp=s.charAt(i)+"";
			if(s1.contains(temp)==false)
			{
				s2+=s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
