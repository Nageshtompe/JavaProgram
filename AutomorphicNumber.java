import java.util.Scanner;

public class AutomorphicNumber {


	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("check automorphic number");

		while(true)
		{
			System.out.println("Enter Any Number");
			int a=sc.nextInt();
			if(a>0)
			{
				int temp=(int) Math.pow(a, 2);
				String s1=Integer.toString(a);
				String s2=Integer.toString(temp);

				System.out.println(s2.endsWith(s1));
				System.out.println("-------------------------------");
			}
			else {
				System.out.println("sorry bsdk Invalid chioce..!");
				break;
			}
		}
	}

}
