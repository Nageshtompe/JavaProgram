package Vector;

import java.util.Vector;

public class CreateVectorClass {
	public static void main(String[] args) {
		
		
		Vector<Integer> vector=new Vector<Integer>();
		Vector<Integer> vector1=new Vector<Integer>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		vector.add(60);
		
		//vector.add(3, 30);						add element at perticular index
		//vector1.addAll(vector);					add all elements in one vector to another	
		vector.addElement(100);
		
		//int ele=vector.capacity();				return capacity of internal array
		
		//vector.clear();							remove all elements from array
		System.out.println(vector);
		System.out.println(vector.containsAll(vector1));
		
		//System.out.println(vector.contains(100));		return boolean value if the element present in the array
		
		//System.out.println(ele);
		
	}

}
