package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();

		list.add("red");
		list.add("black");
		list.add("white");
		list.add("blue");
		list.add("green");
		list.add("yellow");
		
		
		Iterator<String> al=list.listIterator();
		
		while(al.hasNext()==true)
		{
			System.out.println(al.next());
		}
		System.out.println("------Using Iterator-------");
		
		for(String data:list)
		{
			System.out.println(data);
		}
		System.out.println("------Using Enhance for loop--------");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("--------Using for loop-------");
		
		int i=0;
		while(i<list.size())
		{
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("--------Using while loop-------");

	}

}
