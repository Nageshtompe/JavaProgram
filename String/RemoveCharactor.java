package String;

public class RemoveCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abhaca";
		
		
		char ch='a';
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				s1=s1+s.charAt(i);
				
			}
		}
		System.out.println(s1);
		
		
//		char[]a=s.toCharArray();
//		
//		int org=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int dup=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//					dup++;
//			}
//			if(dup==0)
//				org++;
//		}
//		char []b=new char[org];
//		int index=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int dup=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				dup++;
//			}
//			if(dup==0)
//				b[index++]=a[i];
//		}
//		System.out.println(b);

	}

}
