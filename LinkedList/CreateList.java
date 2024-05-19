package LinkedList;

import java.util.LinkedList;

public class CreateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.remove(3);
		
		list.add(2, 60);
		
		
		Integer ele=60;
		list.remove(ele);
		
		boolean result=list.contains(50);
		System.out.println(result);
		
		System.out.println(list);
		

	}

}
