package Arraylist;

import java.util.ArrayList;

public class SetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.set(2,100);				//remove perticular index element and then add the new element
		System.out.println(list);
		
		list.add(2, 200);				//it does not remove the element
		System.out.println(list);		//add the element on perticular index and shift the other element to right 

	}

}
