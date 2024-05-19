import java.util.ArrayList;
import java.util.Collection;

public class MisingElement {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= {11,14,12,16,15};
		myCode(a);
	}
	//EndOfMainMethod

	public static void myCode(int[] a) 
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		//System.out.println(min+" "+max);
		

		for (int i = min; i <max; i++) {
			int cnt=0;
			for (int j = 0; j < a.length; j++) {
				if(i==a[j])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println("missing element : "+i);
		}

	}

}
