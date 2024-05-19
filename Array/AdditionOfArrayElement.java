package Array;
import java.util.*;

public class AdditionOfArrayElement {

	public static void main(String ags[]) {
		int a[]=new int[5];

		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 5 elements :");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0;i<a.length;i++)
		{

			sum=sum+a[i];

		}
		System.out.println("sum of all array element is : "+sum);


	}


}
