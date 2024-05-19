package Array;

import java.util.Scanner;

public class WriteElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 elements :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
