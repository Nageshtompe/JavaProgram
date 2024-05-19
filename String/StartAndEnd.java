package String;

public class StartAndEnd {
	
	public static void main(String args[])
	{
		String s1="vsfsvhvsf";
		String s2="vsf";
		
		boolean startsWith=s1.startsWith(s2);
		System.out.println(startsWith);
		
		
		boolean endsWith=s1.endsWith(s2);
		System.out.println(endsWith);
		
	}

}
