package Variation;

import java.util.ArrayList;

public class RightShiftingUsingArraaylist {

	public static void main(String[] args) {
		int[] a= 
			{
				7,4,3,4,6,9
			}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[] a) 
	{
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.print(al);
		//write code here
	}

}


