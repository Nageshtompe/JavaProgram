package String;

public class StartEndLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab";
		
		String s2="abc";
		
		if(s1.length()>=s2.length())
		{
		int cnt=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				cnt++;
			}
				
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
