package Arraylist;

import java.util.ArrayList;

public class CopyElement {

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
		
		for(int al:list)
			list2.add(al);
		
		System.out.println(list2);
			

	}

}
