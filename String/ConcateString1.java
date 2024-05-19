package String;

public class ConcateString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcd";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			s2=s2.concat(s.charAt(i)+""+s.charAt(i));
		}
		System.out.println(s2);
		
	}

}
