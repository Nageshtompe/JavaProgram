package Variation;

public class GCDOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number=123;
		int x=2;
		int y=3;

		String s="";

		s=s+number;
		String s1=s.repeat(x);
		String s2=s.repeat(y);

		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);

		int start=Math.min(num1, num2);
		


		for(int i=start;i>0;i--)
		{
			if(num1%i==0&&num2%i==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}

