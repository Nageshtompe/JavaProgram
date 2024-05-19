import java.util.HashMap;
import java.util.Set;

public class SetViewOfTheKeysContainedInThisMap {

	
		//private static Set<Entry<Integer, String>> entrySet;
		//StartOfMainMethod
		public static void main(String[] args) 
		{
			HashMap<Integer,String> map = new HashMap <Integer,String> ();
			map.put(1, "Red");
			map.put(2, "Green");
			map.put(33, "Black");
			map.put(40, "White");
			map.put(51, "Blue");
			myCode(map);
		}
		//EndOfMainMethod
		public static void myCode(HashMap<Integer,String> map) 
		{
			Set<Integer> a = map.keySet();
			for(int i:a)
			{
				System.out.println(i);
			}
		}
	}
