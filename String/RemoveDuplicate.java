package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdabcabc";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
				if(count==0)
				{
					s1=s1+s.charAt(i);
				}
			
		}
		System.out.println(s1);
	}

}
