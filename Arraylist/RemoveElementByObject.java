package Arraylist;

import java.util.ArrayList;

public class RemoveElementByObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(11);
		list.add(22);
		list.add(11);
		list.add(22);
		list.add(11);
		list.add(22);
		
		Integer ele=22;
		list.remove(ele);				//to pass int value we need to convert it into wrapper class
		System.out.println(list);		//if the more then one element are present then it removes the first element.

	}

}
