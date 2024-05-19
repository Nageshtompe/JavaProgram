import java.util.Arrays;

public class MyClass {
    
   public static void main(String[] args) {
	
//	 for(int i=0;i<ir;i++)
//	 {int cnt1=cnt;
//		 for(int j=0;j<jr;j++)
//		 {
//			 if(j+i<ir)
//				 System.out.print(cnt1++);
//		 }
//		 System.out.println();
//		
//	 }
	  int ir=5;
	 int jr=5;
	 
	 int end=5;
	 for(int i=1;i<=ir;i++)
	 {
		 int cnt=1;
		 for(int j=1;j<=end;j++)
		 {
			System.out.print(cnt);
				cnt++;
		 }
		 System.out.println();
		 for(int k=1;k<=end;k++)
		 {
		 System.out.print("*");
		 }
		 end--;
		 System.out.println();
		
	 
   }}}