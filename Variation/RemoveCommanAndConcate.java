package Variation;

public class RemoveCommanAndConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aacdb";
		String s2="gafd";
		String s3="";			//cbgf
		
		for(int i=0;i<s1.length();i++)
		{
			String temp=s1.charAt(i)+"";
			if(s2.contains(temp)==false)
				s3+=temp;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			String temp=s2.charAt(i)+"";
			if(s1.contains(temp)==false)
				s3+=temp;	
		}
		if(s3.isBlank()==true)
		{
			System.out.println("");
		}
		System.out.println(s3);

	}

}



//String s4=s1+s2;
//String s5="";
//for(int i=0;i<s4.length;i++)
//{
//	int cnt=0;
//	for(int j=0;j<i;j++)
//	{
//		if(s4.charAt(i)==s4.charAt(j))
//		{
//			cnt++;
//			break;
//		}
//	}
//	for(int j=i+1;j<s4.length();j++)
//	{
//		if(s4.charAt(i)==s4.charAt(j))
//		{
//			cnt++;
//			break;
//
//		}
//	}
//	if(cnt==0)
//	{
//		s5+=s4.charAt(i);
//	}
//	System.out.println(s5);
//}
