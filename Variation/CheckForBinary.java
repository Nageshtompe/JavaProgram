package Variation;

public class CheckForBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1012";
		
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0'||str.charAt(i)=='1')
			{
				cnt++;
				
			}
		}
		if(cnt==str.length())
		{
			System.out.println(1);
		}
		else
			System.out.println(0);
		

	}

}
