package String;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="     abcd abcd   ";    //abcd abcd
		
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				start++;
			}
			else
				break;
		}
		
		int end=s.length()-1;
		for(int i=s.length()-1;i>0;i--)
		{
			if(s.charAt(i)==' ')
			{
				end--;
			}
			else
				break;
			
		}
		for(int i=start;i<=end;i++)
		System.out.print(s.charAt(i));

	}

}
