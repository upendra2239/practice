package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ColMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		hm.putIfAbsent(3, "z");
		
		System.out.println(hm);
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(1, "a");
		tm.put(2, "b");
		tm.put(4, "d");
		tm.put(5, "e");
		tm.put(3, "c");
		
		
		System.out.println(hm);
		
		for(int key: tm.keySet()) {
			System.out.println(key+"-"+tm.get(key));
		}
		
		Set<Entry<Integer, String>> entries = hm.entrySet();
		for(Entry<Integer, String> entry: entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" - "+value);
		}
	}

}
