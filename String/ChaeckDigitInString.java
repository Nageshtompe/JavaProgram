package String;

public class ChaeckDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "1a234567";
		
		
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
			cnt++;
			}
		}
		
		if(cnt==s.length())
		{
			System.out.println(true);
		}
		else
		{
			
			System.out.println(false);
			
		}
	}
}
