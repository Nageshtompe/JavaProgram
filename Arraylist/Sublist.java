package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Sublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		List<Integer> subList=list.subList(1, 4);
		
		System.out.println(subList);

	}

}
