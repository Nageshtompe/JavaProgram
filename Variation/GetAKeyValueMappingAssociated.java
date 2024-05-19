package Variation;

import java.util.Map;
import java.util.TreeMap;

public class GetAKeyValueMappingAssociated {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(9, "Red");
		map.put(2, "Green");
		map.put(1, "tyu");
		map.put(4, "White");
		map.put(5, "sks");

		int key = 3;
		myCode(map, key);
	}

	public static void myCode(TreeMap<Integer, String> map, int key) {
		// Get the greatest key less than or equal to the given key
		Map.Entry<Integer, String> entry = map.floorEntry(key);

		if (entry != null) {
			int foundKey = entry.getKey();
			String value = entry.getValue();
			System.out.println(foundKey + "=" + value);
		} else {
			System.out.println("No key less than or equal to " + key);
		}
	}
}
