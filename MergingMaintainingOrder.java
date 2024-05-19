import java.util.Arrays;

public class MergingMaintainingOrder {

	/* Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by
	   maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.


	Example:
	Input :
	int[] A = { 1, 5, 6, 7, 8, 10 }
	int[] B = { 2, 4, 9 }
	Output:
	Sorted Arrays:
	A: [1, 2, 4, 5, 6, 7]
	B: [8, 9, 10] */

	public static void main(String[] args) {
		int[] A = { 1, 5, 6, 7, 8, 10 };
		int[] B = { 2, 4, 9 };
		myCode(A,B);
	}
	public static void myCode(int a[],int b[])
	{
		int p=a.length;
		int q=b.length;

		int c[]=new int[p+q];

		int index=0;
		for (int i = 0; i < c.length; i++) {

			if(i<p)
			{
				c[index++]=a[i];
			}
			if(i<q)
			{
				c[index++]=b[i];
			}
		}
		Arrays.sort(c);
		for (int i = 0; i < p; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for (int i = p; i <p+q; i++) {
			System.out.print(c[i]+" ");
		}
	}

}

