package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CopyElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		Collections.copy(list2,list);
		
		System.out.println(list2);

	}

}
