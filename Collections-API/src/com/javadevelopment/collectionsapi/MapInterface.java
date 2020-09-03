package com.javadevelopment.collectionsapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		map.put("Dhoni", 7);
		map.put("Virat", 18);
		map.put("Dhoni", 2020);
		// map.put(null, 5);
		// map.put(null, 6);
		// map.put(null, null);
		map.put("Sachin", 25);

		// System.out.println(map.get("Dhoni"));
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		// Iterator<String> itr=map.keySet().iterator();
		/*while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());

		}*/

		// System.out.println(map);
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next().getKey()+"--"+itr.next().getValue());

		}

	}

}
