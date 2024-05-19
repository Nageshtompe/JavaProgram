import java.util.Scanner;

public class NumberOfDivisors {
	
	public static void main(String[] args) {
		
		//it shows the count of number which is divisible by three(3)
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int number=3;
		int cnt=0;
		for (int i = 0; i <num ; i++) {
			if(i%number==0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
