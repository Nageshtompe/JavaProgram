package Arraylist;

import java.util.ArrayList;

public class RemoveElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();

		list.add("red");
		list.add("black");
		list.add("white");
		list.add("blue");
		list.add("green");
		list.add("yellow");
		
		list.remove(3);			//it accept the index value
		System.out.println(list);

	}

}
