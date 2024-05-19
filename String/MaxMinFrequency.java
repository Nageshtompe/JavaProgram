package String;

public class MaxMinFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdabcaba";
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MIN_VALUE;
		char ch1=0;
		char ch2=0;
		
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
				System.out.println(ch2+" "+min);
				System.out.println(ch1+" "+max);
			}
			
		}
		
	}

}
