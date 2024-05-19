package String;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="absndbab";
		String s2="ab";
		
		if(s1.length()>=s2.length())
		{
			
		int cnt=0;
		int s1Index=s1.length()-1;
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			if(s2.charAt(i)==s1.charAt(s1Index))
			{
				cnt++;
			}
			s1Index--;
		}
		
		
		if(cnt==s2.length())
			System.out.println(true);
		else
			System.out.println(false);
		}
		else
			System.out.println(false);

	}

}
