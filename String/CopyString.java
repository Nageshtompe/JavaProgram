package String;

public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcd";
		
		String s2="";
		
		
		char []c1=s1.toCharArray();
		char []c2=s2.toCharArray();
		
		System.arraycopy(c1,0,c2,0,c2.length);
		
		System.out.print(s2);
		
		

	}

}
