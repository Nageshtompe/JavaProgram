package Variation;

import java.util.Arrays;

public class SumPairClosestOfX {
	
	public static void main(String[] args) {
		int[] a = {10, 22, 28, 29, 30, 40};
		int x = 54;
		int n = a.length;
		myCode(a, n, x);
	}

	public static void myCode(int[] a, int n, int x) {
		int left = 0;
		int right = n - 1;
		int closestSum = Integer.MAX_VALUE;
		int[] closestPair = new int[2];

		while (left < right) {
			int sum = a[left] + a[right];

			if (Math.abs(sum - x) < Math.abs(closestSum - x)) {
				closestSum = sum;
				closestPair[0] = a[left];
				closestPair[1] = a[right];
			}

			if (sum < x) {
				left++;
			} else {
				right--;
			}
		}

		System.out.println(Arrays.toString(closestPair));
	}
}

