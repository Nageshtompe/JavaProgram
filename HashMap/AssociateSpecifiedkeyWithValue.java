package HashMap;

import java.util.HashMap;
import java.util.NavigableMap;

public class AssociateSpecifiedkeyWithValue {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		
		map.put(01, "abc");
		map.put(02, "anna");
		map.put(03, "akshay");
		map.put(04, "tushar");
		map.put(05, "rohit");
		
		
		//Write a program to count the number of key-value (size) mappings in a map
		//System.out.println(map.size());
		
		//Write a program to copy all of the mappings from the specified map to another map
		//HashMap<Integer, String> map2=new HashMap<Integer,String>(map);
		//System.out.println(map2);
		
		//Write a program to remove all of the mappings from a map
		//map2.clear();
		//System.out.println(map2);
		
		//Write a program to check whether a map contains key-value mappings (empty) or not.
		//System.out.println(map.containsKey(04));
		
		
		NavigableMap<Integer, String> map1=((NavigableMap<Integer, String>) map).descendingMap();
		System.out.println(map);
	}

}
