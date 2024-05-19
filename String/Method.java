package String;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="cbba";
		String s2="ab";
		
		char ch=s1.charAt(0);
		System.out.println(ch);
		
		int codePointAt=s1.codePointAt(0);
		System.out.println(codePointAt);
		
		int codePointBefore=s1.codePointBefore(3);
		System.out.println(codePointBefore);
		
		int ans=s1.compareTo(s2);
		System.out.println(ans);
	}

}
