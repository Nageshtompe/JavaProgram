package LinkedList;

import java.util.LinkedList;

public class RemoveMethod {
	
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		
		list.remove(5);				//it get index and remove the perticular element
		Integer ele=30;					//converting int to Integer wrapper class object
		list.remove(ele);				//it takes only object input for
		list.removeFirst();
		list.removeLast();
		
		
		
		//list.removeAll(list);			//Remove all element in list
		
		System.out.println(list);
		
	}

}