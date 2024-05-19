package String;

public class IsBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="xjksb";
		
		boolean isBlank=s.isBlank();
		System.out.println(isBlank);
		
		
		String s1="     ";
		//Space consider that
		
		boolean isBlank1=s1.isBlank();
		System.out.println(isBlank1);
		
		String s2="";
		boolean isBlank2=s2.isBlank();
		System.out.println(isBlank2);
		
		

	}

}
