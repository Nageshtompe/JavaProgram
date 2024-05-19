package String;

public class CountOfFrquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdabcaba";
		
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
			
			if(cnt==0)
			{
				int count=0;
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
						
					}
					
					
				}
				System.out.println(s.charAt(i)+" frequency of String is : "+count);
			}
			
		}
		
	}

}
