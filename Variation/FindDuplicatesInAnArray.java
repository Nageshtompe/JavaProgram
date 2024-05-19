package Variation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class FindDuplicatesInAnArray {

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= {2,1,2,3,1,1};
			myCode(a);
		}
		//EndOfMainMethod

		
		public static void myCode(int[]a)
		{
			TreeSet<Integer> ls=new TreeSet <Integer>();
			
		
			int k=0;
			for (int i = 0; i < a.length; i++) {
				int cnt=0;
		
				
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j])
					{
						cnt++;
					}
				}
				if(cnt!=0)
				{

ls.add(a[i]);
					k++;
				}
				
			}
			if(k==0)
			{
				ls.add(-1);
			}
			System.out.println(ls);
			//Write code here
			
			
		}
}
