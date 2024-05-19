package HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(10);
		hs.add(14);
		hs.add(13);
		hs.add(67);
		hs.add(14);
		hs.add(43);
		hs.add(98);
		hs.add(07);
		
HashSet<Integer> hs2=new HashSet<Integer>();
		
		hs2.add(10);
		hs2.add(17);
		hs2.add(76);
		hs2.add(24);
		hs2.add(97);
		hs2.add(43);
		hs2.add(98);
		hs2.add(07);
		
		
		System.out.println(hs2.retainAll(hs));
		//hs.removeAll(hs);
		//hs.remove(98);
		//hs.isEmpty();
		//hs.contains(67);
		
		hs.
		System.out.println(hs2);
	}

}
