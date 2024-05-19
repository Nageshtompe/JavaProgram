package String;

public class ReverseByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="You all are very very very good students";
		
		//1st output : students good very very very are all You 
		
		
		String s1[]=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
			
			{
			System.out.println(s1[i]);
			
			}
	}

}
