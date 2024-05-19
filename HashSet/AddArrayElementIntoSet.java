package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class AddArrayElementIntoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,4,3,5,7,2,6,2,2,7,8,4,9,6};
		
		HashSet<Integer> set=new HashSet<Integer>();				//does not follow insertion order
		
		for(int data:arr)
		{
			set.add(data);
		
		}
		
		System.out.println(set);
		System.out.println("-----------------");
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		
		
		ArrayList<Integer> list=new ArrayList<Integer>(hs);			//converting hashset to arraylist 
		System.out.println(list);
		

	}

}
