package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(30);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(60);
		
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
