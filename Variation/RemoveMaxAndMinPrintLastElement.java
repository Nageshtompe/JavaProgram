package Variation;

import java.util.Collections;
import java.util.LinkedList;

public class RemoveMaxAndMinPrintLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,1,2,9,4,3,7,5};
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		for(int data:a)
		list.add(data);
		
		Collections.sort(list);   //Arrays.sort(a)
		
//		while(list.size()>1)
//		{
//			if(list.size()!=2)
//			{
//				list.removeLast();
//				list.removeFirst();
//			}
//			else
//			{
//				list.removeLast();
//				break;
//			}
//		}
		
		
		if(a.length%2==0)
		{
			
			System.out.println(a[(a.length/2)-1]);
		}
		else
			System.out.println(a[a.length]/2);
		//System.out.println(list);

	}

}


//{2,3,4,5,7,8,9}   7

//{1,2,3,4,5,6,7,8}  8


//if(a.length%2==0)

