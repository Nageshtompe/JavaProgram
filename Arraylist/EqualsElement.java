package Arraylist;

import java.util.ArrayList;

public class EqualsElement {

	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		ArrayList<Integer> list2=new ArrayList<Integer>();

		list2.add(60);
		list2.add(30);
		list2.add(30);
		list2.add(50);
		list2.add(20);
		list2.add(10);
		
		boolean euals=list.equals(list2);
		
		System.out.println(euals);


	}

}
