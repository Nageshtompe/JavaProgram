package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();			//<Integer> ------wrapper class
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		HashSet<Integer> hs=new HashSet<Integer>(list);
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));

	}

}
