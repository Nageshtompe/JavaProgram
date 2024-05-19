package String;

public class UncommanCharecterPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abhfcs";
		String s2="ahdfck";

		String s3=s1.concat(s2);		//abfcgdtahgl
		String s4="";						//output :   bfcdthl
		
		for(int i=0;i<s3.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s3.charAt(i)==s3.charAt(j))
				{
					cnt++;
					break;
				}
			}
			for(int j=i+1;j<s3.length();j++)
			{
				if(s3.charAt(i)==s3.charAt(j))
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
			{
				s4=s4+s3.charAt(i);
			}
		}
		System.out.println(s4);
	}
}
