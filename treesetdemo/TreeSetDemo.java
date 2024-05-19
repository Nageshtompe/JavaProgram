package treesetdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(34);
		ts.add(367);
		ts.add(65);
		ts.add(23);
		ts.add(87);
		ts.add(43);
		
		System.out.println(ts);
		
		Iterator<Integer> it=ts.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
