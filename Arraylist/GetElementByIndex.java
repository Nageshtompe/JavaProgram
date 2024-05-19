package Arraylist;

import java.util.ArrayList;

public class GetElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		int ele=list.get(2);		//autounboxing and unboxing
		System.out.println(ele);
		System.out.println(list);
	}

}
