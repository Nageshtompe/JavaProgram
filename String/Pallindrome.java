package String;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="aba";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
			
		}
		boolean palindrome=s.equals(s2);			
		if(palindrome==true)						//if(s.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
