package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MyClass {


	public static void main(String[] args) 
	{


		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();


		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		
		System.out.println(al.toArray());
		//al.subList(2, 6);
		//al.set(4, 1000);
		//al.remove(ele);
		//al.remove();
		//al.lastIndexOf(50);
		//al.isEmpty();
		//al.indexOf(al1);
		//al.hashCode();
		//al.getClass();
		//al.containsAll(al1)
		//al.contains(50);
		//al.clear();
		//al.addAll(al1);
		//al.equals(al1);
		//al.addAll(3, al1);
		//System.out.println(al.addAll(al));
		System.out.println(al);
		

	}
}
