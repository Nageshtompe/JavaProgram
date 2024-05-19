 package String;

public class DuplicatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdabbchjsbcdabcd";
		
		String s1="";
		
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;
				
			}
			if(cnt!=0)
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println(s1.length());

	}

}
